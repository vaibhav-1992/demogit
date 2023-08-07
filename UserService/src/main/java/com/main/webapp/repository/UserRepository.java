package com.main.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.webapp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
