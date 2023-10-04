package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customers {

	@Id
	@Column(name="CUSTOMER_NUMBER" , nullable=false)
	private int customerNumber;
	
	
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	
	@Column(name="CUSTOMER_FIRST_NAME" , nullable=false)
	private String customerFirstName;
	
	@Column(name="CUSTOMER_LAST_NAME" , nullable=false)
	private String contactLastName;
	
	@Column(name="PHONE" , nullable=false)
	private String phone;
	
	@Column(name="ADDRESS_LINE1" , nullable=false)
	private String addressLine1;
	
	@Column(name="ADDRESS_LINE2")
	private String addressLine2;
	
	@Column(name="CITY" , nullable=false)
	private String city;
	
	@Column(name="STATE" , nullable=false)
	private String state;
	
	@Column(name="POSTAL_CODE" , nullable=false)
	private String postalCode;
	
	@Column(name="COUNTRY" , nullable=false)
	private String country;
	
	@Column(name="CREDIT_LIMIT" , nullable=false)
	private double creditLimit;

	/** many to one mapping 
	 * many customer have one employee representative
	 * */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEE_REP")
	private Employees employeeRep;

	/** one to many mapping
	 * one customer does many payments
	 */
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private List<Payments> payment;

	/** one to many mapping
	 * customer can have multiple orders.
	 */
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private List<Order> orders;
	
	
	/**
	 * getters and setters*/

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Employees getEmployeeRep() {
		return employeeRep;
	}

	public void setEmployeeRep(Employees employeeRep) {
		this.employeeRep = employeeRep;
	}

	public List<Payments> getPayment() {
		return payment;
	}

	public void setPayment(List<Payments> payment) {
		this.payment = payment;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	/**
	 * no arguments constructor*/

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**arguments constructor
	 * */

	public Customers(int customerNumber, String customerName, String customerFirstName, String contactLastName,
			String phone, String addressLine1, String addressLine2, String city, String state, String postalCode,
			String country, double creditLimit, Employees employeeRep, List<Payments> payment, List<Order> orders) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerFirstName = customerFirstName;
		this.contactLastName = contactLastName;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.creditLimit = creditLimit;
		this.employeeRep = employeeRep;
		this.payment = payment;
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customers [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerFirstName="
				+ customerFirstName + ", contactLastName=" + contactLastName + ", phone=" + phone + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state
				+ ", postalCode=" + postalCode + ", country=" + country + ", creditLimit=" + creditLimit
				+ ", employeeRep=" + employeeRep + ", payment=" + payment + ", orders=" + orders + "]";
	}




}
