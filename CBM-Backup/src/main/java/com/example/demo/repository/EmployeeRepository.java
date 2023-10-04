package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employees;


public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

}
