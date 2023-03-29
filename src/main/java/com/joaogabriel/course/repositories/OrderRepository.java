package com.joaogabriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaogabriel.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
