/**
 * 
 */
package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.exception.ResourceNotFoundException;
import com.hcl.model.User;
import com.hcl.repository.UserRepository;

/**
 * 
 * @author User1
 *
 */
@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public Page<User> getAllPosts(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@PutMapping("/users/{userId}")
	public User updateUser(@PathVariable Long userId, @RequestBody User userRequest) {
		return userRepository.findById(userId).map(user -> {
			user.setUserName(userRequest.getUserName());
			user.setPassword(userRequest.getPassword());
			return userRepository.save(user);

		}).orElseThrow(() -> new ResourceNotFoundException("UserId " + userId + " not found"));
	}

	@DeleteMapping("/users/{userId}")
	public ResponseEntity<?> deletePost(@PathVariable Long userId) {
		return userRepository.findById(userId).map(user -> {
			userRepository.delete(user);
			return ResponseEntity.ok().build();
		}).orElseThrow(() -> new ResourceNotFoundException("UserId " + userId + " not found"));
	}

	
}
