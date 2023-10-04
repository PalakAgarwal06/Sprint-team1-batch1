package com.example.demo.exception;

public class OrderDetailsNotFoundException extends Exception{

	String message;
	
	

	public OrderDetailsNotFoundException(String message) {
		this.message = message;
	}



	public String getMessage() {
		return message;
	}

}
