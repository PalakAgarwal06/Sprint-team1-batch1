package com.example.demo.exception;

public class OrderNotFoundException extends Exception{

	String message;
	
	

	public OrderNotFoundException(String message) {
		this.message = message;
	}



	public String getMessage() {
		return message;
	}

}