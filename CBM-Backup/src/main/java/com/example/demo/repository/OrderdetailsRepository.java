package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.OrderDetails;

public interface OrderdetailsRepository extends JpaRepository<OrderDetails, Integer>{

}
