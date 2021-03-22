package com.alefeoliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alefeoliveira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
