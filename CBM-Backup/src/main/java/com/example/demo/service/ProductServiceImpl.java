package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.exception.ProductNotFoundException;

import com.example.demo.entities.Product;

import com.example.demo.repository.ProductsRepository;

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductsRepository prepo;

	@Override

	public Product createProduct(Product product) {

		return prepo.save(product);

	}

	@Override

	public List<Product> getAllProduct(Product Product) {

		return prepo.findAll();

	}

	@Override

	public Product updateProduct(Product Product) throws ProductNotFoundException {

		// TODO Auto-generated method stub

		if (prepo.findById(Product.getProductCode()).isEmpty()) {

			throw new ProductNotFoundException("Product not found");

		}

		else {

			return prepo.save(Product);

		}

	}

	@Override

	public Product getProductById(String productCode) throws ProductNotFoundException {

		if (prepo.findById(productCode).isEmpty()) {

			throw new ProductNotFoundException("Product not found");

		}

		else {

			return prepo.findById(productCode).get();

		}

	}

	@Override

	public void deleteProduct(String productCode) throws ProductNotFoundException {

		// TODO Auto-generated method stub

		if (prepo.findById(productCode).isEmpty()) {

			throw new ProductNotFoundException("Product not found");

		}

		else {

			prepo.deleteById(productCode);

		}

	}

	@Override
	public Product updateBuyPrice(String productCode, double buyPrice) throws ProductNotFoundException {
		if (prepo.findById(productCode).isEmpty()) {

			throw new ProductNotFoundException("Product not found");

		}

		else {

			Product product=prepo.findById(productCode).get();
			product.setBuyPrice(buyPrice);
			return prepo.save(product);

		}

	}

	@Override
	public Product updateVendor(String productCode, String Vendor) throws ProductNotFoundException {
		if (prepo.findById(productCode).isEmpty()) {

			throw new ProductNotFoundException("Product not found");

		}

		else {

			Product product=prepo.findById(productCode).get();
			product.setProductVendor(Vendor);
			return prepo.save(product);

		}
	}

	@Override
	public Product updateVendor(String productCode, Double msrp) throws ProductNotFoundException {
		if (prepo.findById(productCode).isEmpty()) {

			throw new ProductNotFoundException("Product not found");

		}

		else {

			Product product=prepo.findById(productCode).get();
			product.setMsrp(msrp);
			return prepo.save(product);

		}
	}

	
	}


