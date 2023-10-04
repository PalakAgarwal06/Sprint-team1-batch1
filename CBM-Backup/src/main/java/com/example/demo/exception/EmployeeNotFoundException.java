package com.example.demo.exception;

public class EmployeeNotFoundException extends Exception{

	String message;
	
	

	public EmployeeNotFoundException(String message) {
		this.message = message;
	}



	public String getMessage() {
		return message;
	}

}
