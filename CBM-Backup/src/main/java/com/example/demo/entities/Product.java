package com.example.demo.entities;

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
@Table(name="PRODUCT")
public class Product {

	/**
	 * The unique identifier of the Product.
	 */
	@Id
	@Column(name = "PRODUCT_CODE")
	private String productCode;

	@Column(name = "PRODUCT_NAME", nullable=false)
	private String productName;

	/**
	 * The product line associated with the product.
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PRODUCT_LINE")
	private ProductLine productLine;

	@Column(name = "PRODUCT_SCALE", nullable=false)
	private String productScale;
	
	@Column(name = "PRODUCT_VENDOR", nullable=false)
	private String productVendor;

	@Column(name="DESCRIPTION",length = 1000)
	private String description;

	@Column(name = "QUANTITY_IN_STOCK", nullable=false)
	private int quantityInStock;
	
	@Column(name = "BUY_PRICE", nullable=false)
	private double buyPrice;
	
	@Column(name = "MSRP", nullable=false)
	private double msrp;

	/** many-to-one association
	 *  order details belongs to a single product.
	 */
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	private List<OrderDetails> details;

	
	
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ProductLine getProductLine() {
		return productLine;
	}

	public void setProductLine(ProductLine productLine) {
		this.productLine = productLine;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public double getMsrp() {
		return msrp;
	}

	public void setMsrp(double msrp) {
		this.msrp = msrp;
	}

	public List<OrderDetails> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetails> details) {
		this.details = details;
	}

	/**
	 * Constructs a new Product instance with default values.
	 */
	public Product() {
		super();
	}

	public Product(String productCode, String productName, ProductLine productLine, String productScale,
			String productVendor, String description, int quantityInStock, double buyPrice, double msrp,
			List<OrderDetails> details) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productLine = productLine;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.description = description;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.msrp = msrp;
		this.details = details;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productLine=" + productLine
				+ ", productScale=" + productScale + ", productVendor=" + productVendor + ", description=" + description
				+ ", quantityInStock=" + quantityInStock + ", buyPrice=" + buyPrice + ", msrp=" + msrp + ", details="
				+ details + "]";
	}
	
	
	
	

	
}

