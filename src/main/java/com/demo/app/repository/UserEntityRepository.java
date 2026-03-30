package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.app.entity.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {

}