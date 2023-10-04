package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Customers;

import com.example.demo.exception.CustomerNotFoundException;

import com.example.demo.repository.CustomersRepository;

public class CustomerServiceImpl implements CustomerService {

	@Autowired

	CustomersRepository customerRepo;

	@Override

	public Customers getCustomerById(int customerNumber) throws CustomerNotFoundException {

		if (customerRepo.findById(customerNumber).isEmpty())

			throw new CustomerNotFoundException("The Customer with" + customerNumber + "does not exist");

		return customerRepo.findById(customerNumber).get();

	}

	@Override

	public List<Customers> getAllCustomers() {

		return customerRepo.findAll();

	}

	@Override

	public void createCustomer(Customers customers) throws CustomerNotFoundException {

		customerRepo.save(customers);

	}

	@Override

	public Customers updateCustomer(Customers customer) throws CustomerNotFoundException {

		if (customerRepo.findById(customer.getCustomerNumber()).isEmpty())

			throw new CustomerNotFoundException("The Customer with" + customer.getCustomerNumber() + "does not exists");

		return customerRepo.save(customer);

	}

	@Override

	public void deleteCustomer(int customerNumber) throws CustomerNotFoundException {

		if (customerRepo.findById(customerNumber).isEmpty())

			throw new CustomerNotFoundException("the Customer with" + customerNumber + "does not exists");

		customerRepo.delete(customerRepo.findById(customerNumber).get());

	}

}
