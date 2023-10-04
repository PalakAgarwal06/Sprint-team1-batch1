package com.example.demo.service;

import java.util.List;
import com.example.demo.entities.Order;
import com.example.demo.exception.OrderNotFoundException;
import com.example.demo.entities.Order;

 

public interface OrderService {

	Order createOrder(Order order);
	List<Order> getAllOrder (Order order);
	Order updateOrder (Order order) throws OrderNotFoundException;
	Order getOrderById(int orderNumber) throws OrderNotFoundException;
	void deleteOrder(int orderNumber) throws OrderNotFoundException;

 

}