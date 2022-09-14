package com.student.main.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.main.entity.Entity;

public interface Repository extends JpaRepository<Entity, Integer>{

}
