package com.example.demo.service;

import com.example.demo.entities.*;

import com.example.demo.exception.CustomerNotFoundException;

import java.util.*;

public interface CustomerService {

	Customers getCustomerById(int customerNumber) throws CustomerNotFoundException;

	List<Customers> getAllCustomers();

	void createCustomer(Customers customers) throws CustomerNotFoundException;

	Customers updateCustomer(Customers customer) throws CustomerNotFoundException;

	void deleteCustomer(int customerNumber) throws CustomerNotFoundException;

}
