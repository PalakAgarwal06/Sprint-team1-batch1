package com.example.demo.service;

import java.util.*;

 

import com.example.demo.exception.ProductNotFoundException;

import com.example.demo.entities.Product;

 

public interface ProductService {

	

	Product createProduct(Product product);

	List<Product> getAllProduct(Product Product);

	Product updateProduct(Product Product)throws ProductNotFoundException;

	Product getProductById(String productCode) throws ProductNotFoundException;

	void deleteProduct(String productCode)throws ProductNotFoundException;
	
	Product updateBuyPrice (String productCode,double buyPrice) throws ProductNotFoundException;
	
	Product updateVendor (String productCode,String Vendor) throws ProductNotFoundException;
	
	Product updateVendor (String productCode, Double msrp) throws ProductNotFoundException;
	

	

	

 

}
