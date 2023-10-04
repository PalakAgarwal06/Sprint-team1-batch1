package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Employees;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.repository.EmployeeRepository;

public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employees getEmployeeById(int employeeNumber) throws EmployeeNotFoundException {
		if (employeeRepository.findById(employeeNumber).isEmpty())
			throw new EmployeeNotFoundException("the employee with" + employeeNumber + "does not exists");
		return employeeRepository.findById(employeeNumber).get();
	}

	@Override
	public List<Employees> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void createEmployee(Employees employee) {
		employeeRepository.save(employee);

	}

	@Override
	public Employees updateEmployee(Employees employee) throws EmployeeNotFoundException {
		if (employeeRepository.findById(employee.getEmployeeNumber()).isEmpty())
			throw new EmployeeNotFoundException("the employee with" + employee.getEmployeeNumber() + "does not exists");
		return employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployee(int employeeNumber) throws EmployeeNotFoundException {
		if (employeeRepository.findById(employeeNumber).isEmpty())
			throw new EmployeeNotFoundException("the employee with" + employeeNumber + "does not exists");
		employeeRepository.delete(employeeRepository.findById(employeeNumber).get());

	}

	@Override
	public Employees updateReportsTo(int employeesNumber, int newEmployeesId) throws EmployeeNotFoundException {
		if (employeeRepository.findById(employeesNumber).isEmpty())
			throw new EmployeeNotFoundException("the employee with" + employeesNumber + "does not exists");
		if (employeeRepository.findById(newEmployeesId).isEmpty())
			throw new EmployeeNotFoundException("the employee with" + employeesNumber + "does not exists");
		Employees employees= employeeRepository.findById(employeesNumber).get();
		Employees newEmployees= employeeRepository.findById(newEmployeesId).get();
		employees.setReportsTo(newEmployees);
		employeeRepository.save(employees);
		return employees;
	}

	@Override
	public Employees updateRole(int employeeId, String jobTitle)throws EmployeeNotFoundException {
		if (employeeRepository.findById(employeeId).isEmpty())
			throw new EmployeeNotFoundException("the employee with" + employeeId + "does not exists");
		Employees employees=employeeRepository.findById(employeeId).get();
		employees.setJobTitle(jobTitle);
		return employeeRepository.save(employees);
		
	}

	@Override
	public List<Employees> getByCity(String city) {
		return employeeRepository.findByOfficeCity(city);
	}

	@Override
	public List<Employees> getByOfficeCode(int code) {
		return employeeRepository.findByOfficeCode(code);
	}

	@Override
	public Employees assignOfficeToEmployee(int officeCode, int employeeNumber) throws EmployeeNotFoundException {
		return employeeRepository.assignOfficeToEmployee(officeCode, employeeNumber);
	}

}
