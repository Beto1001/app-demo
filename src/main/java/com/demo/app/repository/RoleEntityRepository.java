package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.app.entity.RoleEntity;

public interface RoleEntityRepository extends JpaRepository<RoleEntity, Long>{
    
}