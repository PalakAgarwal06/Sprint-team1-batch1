package com.example.demo.entities;

import javax.persistence.*;

import java.util.*;

@Entity
@Table(name="EMPLOYEES")
public class Employees {

	
	@Id
	@Column(name = "EMPLOYEE_NUMBER", nullable=false)
	private int employeeNumber;
	
	@Column(name = "LAST_NAME", nullable=false)
	private String lastName;
	
	@Column(name = "FIRST_NAME", nullable=false)
	private String firstName;
	
	@Column(name = "EXTENSION", nullable=false)
	private String extension;
	
	@Column(name = "EMAIL", nullable=false)
	private String email;
	
	@Column(name = "JOB_TITLE", nullable=false)
	private String jobTitle;

	/**
	 * one-to-many mapping
	 * where an employee can have multiple representative customers
	 */
	@OneToMany(mappedBy = "employeeRep")
	private List<Customers> customers;

	/**
	 * The employees who report to this employee. This is a one-to-many
	 * self-relationship, where an employee can have multiple subordinates.
	 */
	@OneToMany(mappedBy = "reportsTo", cascade = CascadeType.ALL)
	private List<Employees> reports;

	/** many-to-one
	 * self-relationship, employee can reports to another employee.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REPORTS_TO_ID")
	private Employees reportsTo;

	/** many-to-one association,
	 * multiple employees can belong to a single office.
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "OFFICE_CODE")
	private Offices offices;

	
	/**
	 * getters-setters
	 * */
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public List<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}

	public List<Employees> getReports() {
		return reports;
	}

	public void setReports(List<Employees> reports) {
		this.reports = reports;
	}

	public Employees getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(Employees reportsTo) {
		this.reportsTo = reportsTo;
	}

	public Offices getOffices() {
		return offices;
	}

	public void setOffices(Offices offices) {
		this.offices = offices;
	}

	
	/**
	 * arguments constructor
	 * */
	public Employees(int employeeNumber, String lastName, String firstName, String extension, String email,
			String jobTitle, List<Customers> customers, List<Employees> reports, Employees reportsTo, Offices offices) {
		super();
		this.employeeNumber = employeeNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.extension = extension;
		this.email = email;
		this.jobTitle = jobTitle;
		this.customers = customers;
		this.reports = reports;
		this.reportsTo = reportsTo;
		this.offices = offices;
	}

	/**no arguments constructor*/
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Employees [employeeNumber=" + employeeNumber + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", extension=" + extension + ", email=" + email + ", jobTitle=" + jobTitle + ", customers="
				+ customers + ", reports=" + reports + ", reportsTo=" + reportsTo + ", offices=" + offices + "]";
	}

	
	
	
	
}

	