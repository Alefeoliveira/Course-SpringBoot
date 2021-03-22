package com.alefeoliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alefeoliveira.course.entities.Order;

public interface OrderRepsitory extends JpaRepository<Order, Long>{

}
