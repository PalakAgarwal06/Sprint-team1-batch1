package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_LINE")
public class ProductLine {
	
	@Id
	@Column(name = "product_line")
	private String productLine;

	@Column(name="TEXT_DESCRIPTION",length = 1000)
	private String textDescription;
	
	@Column(name="HTML_DESCRIPTION",length = 1000)
	private String htmlDescription;

	/**one-to-many  association
	 * where a product line can have multiple products.
	 */
	@OneToMany(mappedBy = "productLine", fetch = FetchType.LAZY)
	private List<Product> products;

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public ProductLine(String productLine, String textDescription, String htmlDescription, List<Product> products) {
		super();
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.products = products;
	}

	public ProductLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductLine [productLine=" + productLine + ", textDescription=" + textDescription + ", htmlDescription="
				+ htmlDescription + ", products=" + products + "]";
	}

	
	

}

