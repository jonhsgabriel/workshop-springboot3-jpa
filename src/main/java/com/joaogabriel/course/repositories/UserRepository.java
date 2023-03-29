package com.joaogabriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaogabriel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
