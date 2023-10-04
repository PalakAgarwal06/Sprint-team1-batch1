package com.example.demo.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@IdClass(PaymentId.class)
public class Payments {

	/**many-to-one association,
	 * payment belongs to a single customer.
	 */
	@Id
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID")
	private Customers customer;

	@Id
	@Column(name = "CHECK_NUMBER", nullable=false)
	private String checkNumber;

	@Temporal(TemporalType.DATE)
	@Column(name = "PAYMENT_DATE", nullable=false)
	private Date paymentDate;
	
	@Column(name = "AMOUNT", nullable=false)
	private double amount;

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

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	
	
	@Override
	public String toString() {
		return "Payments [customer=" + customer + ", checkNumber=" + checkNumber + ", paymentDate=" + paymentDate
				+ ", amount=" + amount + "]";
	}

	public Payments(Customers customer, String checkNumber, Date paymentDate, double amount) {
		super();
		this.customer = customer;
		this.checkNumber = checkNumber;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
