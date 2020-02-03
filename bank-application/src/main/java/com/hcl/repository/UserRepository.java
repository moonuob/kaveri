/**
 * 
 */
package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.User;

/**
 * @author User1
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
