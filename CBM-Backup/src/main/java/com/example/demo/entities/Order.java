package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {

	
	@Id
	@Column(name = "ORDER_NUMBER",nullable=false)
	private int orderNumber;
	
	@Column(name = "ORDER_DATE", nullable=false)
	private Date orderDate;
	
	@Column(name = "REQUIRED_DATE", nullable=false)
	private Date requiredDate;
	
	@Column(name = "SHIPPED_DATE", nullable=false)
	private Date shippedDate;
	
	@Column(name = "STATUS", nullable=false)
	private String status;
	
	@Column(name = "COMMENT")
	private String comment;

	/** many-to-one association,
	 * order belongs to a single customer.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customers customer;

	/** one-to-many association
	 *  where an order can have multiple order details.
	 */
	@OneToMany(mappedBy = "orders", fetch = FetchType.LAZY)
	private List<OrderDetails> orderDetails;

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Order(int orderNumber, Date orderDate, Date requiredDate, Date shippedDate, String status, String comment,
			Customers customer, List<OrderDetails> orderDetails) {
		super();
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.status = status;
		this.comment = comment;
		this.customer = customer;
		this.orderDetails = orderDetails;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", orderDate=" + orderDate + ", requiredDate=" + requiredDate
				+ ", shippedDate=" + shippedDate + ", status=" + status + ", comment=" + comment + ", customer="
				+ customer + ", orderDetails=" + orderDetails + "]";
	}
	
	

}