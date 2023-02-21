package com.ahmi.magehand.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ahmi.magehand.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	public Long countById(Integer id);
	
}
