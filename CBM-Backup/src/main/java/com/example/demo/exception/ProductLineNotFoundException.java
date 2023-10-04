package com.example.demo.exception;

public class ProductLineNotFoundException extends Exception{

	String message;
	
	

	public ProductLineNotFoundException(String message) {
		this.message = message;
	}



	public String getMessage() {
		return message;
	}

}