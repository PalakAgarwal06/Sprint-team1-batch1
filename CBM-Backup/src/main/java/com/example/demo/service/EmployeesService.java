package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Employees;
import com.example.demo.exception.EmployeeNotFoundException;

public interface EmployeesService {

	Employees getEmployeeById(int employeeNumber) throws EmployeeNotFoundException;

	List<Employees> getAllEmployees();

	void createEmployee(Employees employee);

	Employees updateEmployee(Employees employee) throws EmployeeNotFoundException;

	void deleteEmployee(int employeeNumber) throws EmployeeNotFoundException;
	
	Employees updateReportsTo(int employeesNumber, int newEmployeesId) throws EmployeeNotFoundException;
	
	Employees updateRole(int employeeId, String jobTitle) throws EmployeeNotFoundException;
	
	List<Employees> getByCity(String city);
	
	List<Employees> getByOfficeCode(int code);
	
	Employees assignOfficeToEmployee(int officeCode, int employeeNumber) throws EmployeeNotFoundException;
}
