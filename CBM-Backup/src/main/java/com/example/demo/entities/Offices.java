package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "OFFICES")
public class Offices {

	
	@Id
	@Column(name = "OFFICE_CODE", nullable=false)
	private int code;
	
	@Column(name = "CITY", nullable=false)
	private String city;
	
	@Column(name = "PHONE", nullable=false)
	private String phone;
	
	@Column(name = "ADDRESS_LINE1", nullable=false)
	private String addressLine1;
	
	@Column(name = "ADDRESS_LINE2")
	private String addressLine2;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "COUNTRY", nullable=false)
	private String country;
	
	@Column(name = "POSTAL_CODE", nullable=false)
	private String postalCode;
	
	@Column(name = "TERRITORY", nullable=false)
	private String territory;

	/**
	 * The employees associated with the office. This is a one-to-many association,
	 * where an office can have multiple employees.
	 */
	@OneToMany(mappedBy = "offices", fetch = FetchType.LAZY)
	private List<Employees> employees;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}

	public Offices(int code, String city, String phone, String addressLine1, String addressLine2, String state,
			String country, String postalCode, String territory, List<Employees> employees) {
		super();
		this.code = code;
		this.city = city;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.territory = territory;
		this.employees = employees;
	}

	public Offices() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Offices [code=" + code + ", city=" + city + ", phone=" + phone + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", state=" + state + ", country=" + country + ", postalCode="
				+ postalCode + ", territory=" + territory + ", employees=" + employees + "]";
	}
	
	
	

	
}