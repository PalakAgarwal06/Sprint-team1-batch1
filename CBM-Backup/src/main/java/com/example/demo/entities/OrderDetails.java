package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(OrderDetailsId.class)
public class OrderDetails {

	/** many-to-one association
	 *  where an order details belongs to a single product.
	 */
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_CODE")
	private Product product;

	/** This is a many-to-one association
	 *  where an order details belongs to a single order.
	 */
	@ManyToOne
	@Id
	@JoinColumn(name = "ORDERNUMBER", nullable=false)
	private Order orders;

	@Column(name = "QUANTITY_ORDERED", nullable=false)
	private int quantityOrdered;
	
	@Column(name = "PRICE_EACH", nullable=false)
	private double priceEach;
	
	@Column(name = "ORDER_LINE_NUMBER", nullable=false)
	private int orderLineNumber;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrders() {
		return orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	public OrderDetails(Product product, Order orders, int quantityOrdered, double priceEach, int orderLineNumber) {
		super();
		this.product = product;
		this.orders = orders;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}

