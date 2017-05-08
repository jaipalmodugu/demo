package com.example.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;
@Repository
public interface CustomJpa extends JpaRepository<Employee, Integer> {

}
