package com.ahmi.magehand.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahmi.magehand.models.User;

/**
 * 
 * Repository for the User Model.
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public Long findById(Integer id);
	
}
