package com.example.demo.exception;

public class OfficeNotFoundException extends Exception {

	String message;

	public OfficeNotFoundException(String message) {

		this.message = message;

	}

	public String getMessage() {

		return message;

	}

}