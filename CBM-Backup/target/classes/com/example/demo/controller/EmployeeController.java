package com.example.demo.controller;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

 

import com.example.demo.entities.Employees;

import com.example.demo.services.EmployeesService;

 

@Controller

@RequestMapping("/api/v1/employee")

 

public class EmployeeController {

	

	@Autowired

	EmployeesService employeeService;

	

	@GetMapping("/")

	public ResponseEntity<List<Employees>> getAllEmployees(){

		return new ResponseEntity<List<Employees>>(employeeService.getAllEmployees(),HttpStatus.OK);

		

	}

 

}

 