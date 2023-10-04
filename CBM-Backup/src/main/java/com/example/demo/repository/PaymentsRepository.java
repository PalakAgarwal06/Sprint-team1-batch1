package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Payments;

public interface PaymentsRepository extends JpaRepository<Payments, String> {

}
