package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Order;

import com.example.demo.exception.OrderNotFoundException;

import com.example.demo.repository.OrdersRepository;

public class OrderServiceImpl implements OrderService {

	@Autowired
	OrdersRepository orepo;

	@Override

	public Order createOrder(Order order) {

		return orepo.save(order);

	}

	@Override

	public List<Order> getAllOrder(Order order) {

		// TODO Auto-generated method stub

		return orepo.findAll();

	}

	@Override

	public Order updateOrder(Order order) throws OrderNotFoundException {

		// TODO Auto-generated method stub

		if (orepo.findById(order.getOrderNumber()).isEmpty()) {

			throw new OrderNotFoundException("Order Not Found");

		}

		else {

			return orepo.save(order);

		}

	}

	@Override

	public Order getOrderById(int orderNumber) throws OrderNotFoundException {

		// TODO Auto-generated method stub

		if (orepo.findById(orderNumber).isEmpty()) {

			throw new OrderNotFoundException("Order Not Found");

		}

		else {

			return orepo.findById(orderNumber).get();

		}

	}

	@Override

	public void deleteOrder(int orderNumber) throws OrderNotFoundException {

		// TODO Auto-generated method stub

		if (orepo.findById(orderNumber).isEmpty()) {

			throw new OrderNotFoundException("Order Not Found");

		}

		else {

			orepo.deleteById(orderNumber);

		}

	}

}