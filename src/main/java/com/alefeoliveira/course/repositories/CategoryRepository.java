package com.alefeoliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alefeoliveira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
