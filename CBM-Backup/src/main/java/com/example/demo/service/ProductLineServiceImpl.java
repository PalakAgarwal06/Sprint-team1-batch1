package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.exception.ProductLineNotFoundException;

import com.example.demo.entities.ProductLine;

import com.example.demo.repository.ProductlinesRepository;

public class ProductLineServiceImpl implements ProductLineService {

	@Autowired
	ProductlinesRepository productLineRepo;

	@Override

	public ProductLine createProductLine(ProductLine productLine) {

		return productLineRepo.save(productLine);

	}

	@Override

	public List<ProductLine> getAllProductLine(ProductLine productLine) {

		return productLineRepo.findAll();

	}

	@Override

	public ProductLine updateProductLine(ProductLine productLine) throws ProductLineNotFoundException {

		// TODO Auto-generated method stub

		if (productLineRepo.findById(productLine.getProductLine()).isEmpty()) {

			throw new ProductLineNotFoundException("ProductLine not found");

		}

		else {

			return productLineRepo.save(productLine);

		}

	}

	@Override

	public ProductLine getProductLineById(String productLine) throws ProductLineNotFoundException {

		if (productLineRepo.findById(productLine).isEmpty()) {

			throw new ProductLineNotFoundException("ProductLine not found");

		}

		else {

			return productLineRepo.findById(productLine).get();

		}

	}

	@Override

	public void deleteProductLine(String productLine) throws ProductLineNotFoundException {

		// TODO Auto-generated method stub

		if (productLineRepo.findById(productLine).isEmpty()) {

			throw new ProductLineNotFoundException("ProductLine not found");

		}

		else {

			productLineRepo.deleteById(productLine);

		}

	}


}
