package com.joaogabriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaogabriel.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
