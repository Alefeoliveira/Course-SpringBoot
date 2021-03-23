package com.alefeoliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alefeoliveira.course.entities.OrderItem;

public interface OrderitemRepository extends JpaRepository<OrderItem, Long>{
	
}
