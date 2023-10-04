package com.example.demo.service;

 

import java.util.List;
import com.example.demo.entities.ProductLine;
import com.example.demo.exception.ProductLineNotFoundException;

 

public interface ProductLineService {

	ProductLine createProductLine(ProductLine ProductLine);

	List<ProductLine> getAllProductLine(ProductLine ProductLine);

	ProductLine updateProductLine(ProductLine ProductLine) throws ProductLineNotFoundException;

	void deleteProductLine(String productLine) throws ProductLineNotFoundException;

	ProductLine getProductLineById(String productLine) throws ProductLineNotFoundException;

 

}