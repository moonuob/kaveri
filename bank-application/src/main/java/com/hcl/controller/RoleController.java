package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.exception.ResourceNotFoundException;
import com.hcl.model.Role;
import com.hcl.repository.RoleRepository;
import com.hcl.repository.UserRepository;
/**
 * 
 * @author User1
 *
 */
@RestController
public class RoleController {
	
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/users/{userId}/roles")
    public Role createRole(@PathVariable (value = "userId") Long userId,
                                 @RequestBody Role role) {
		System.out.println("here..!");
        return userRepository.findById(userId).map(user -> {
        	role.setUser(user);
            return roleRepository.save(role);
        }).orElseThrow(() -> new ResourceNotFoundException("UserId " + userId + " not found"));
    }

}
