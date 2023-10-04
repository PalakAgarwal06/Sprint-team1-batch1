package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

public class PaymentId implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private Customers customer;
	private String checkNumber;

	public PaymentId() {
		super();
	}

	
	public PaymentId(Customers customer, String checkNumber) {
		super();
		this.customer = customer;
		this.checkNumber = checkNumber;
	}

	
	public Customers getCustomer() {
		return customer;
	}

	
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PaymentId paymentId = (PaymentId) o;
		return Objects.equals(customer, paymentId.customer) && Objects.equals(checkNumber, paymentId.checkNumber);
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(customer, checkNumber);
	}


	@Override
	public String toString() {
		return "PaymentId [customer=" + customer + ", checkNumber=" + checkNumber + "]";
	}

}

