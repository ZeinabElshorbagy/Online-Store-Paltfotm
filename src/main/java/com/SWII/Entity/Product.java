package com.SWII.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Product {
	@Id
	@GeneratedValue
	private Integer productId; 
	private String name;
	private double price;
	private String brand;
	private String category;
	private boolean type;
	
	
	public Product() {
		this.productId=0;
		this.name = "";
		this.price = 0.0;
		this.brand = "";
		this.category = "";
		this.type=false;
	}
	
	public Product(int productId,String name, double price, String brand, String category, boolean type) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.type = type;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	
}
