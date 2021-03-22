package com.alefeoliveira.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alefeoliveira.course.entities.Order;
import com.alefeoliveira.course.repositories.OrderRepsitory;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepsitory repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
	
}
