package com.SWII.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Product {
	@Id
	String productId;

    @OneToMany(mappedBy = "stores", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<StoreProductsEntity> stores;

	String name;
	double lowPrice;
	double highPrice;
	String brand;
	String category;
	
	
	
	
	
	public Product(String productId, Set<StoreProductsEntity> stores, String name, double lowPrice, double highPrice,
			String brand, String category) {
		super();
		this.productId = productId;
		this.stores = stores;
		this.name = name;
		this.lowPrice = lowPrice;
		this.highPrice = highPrice;
		this.brand = brand;
		this.category = category;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Set<StoreProductsEntity> getStores() {
		return stores;
	}
	public void setStores(Set<StoreProductsEntity> stores) {
		this.stores = stores;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}
	public double getHighPrice() {
		return highPrice;
	}
	public void setHighPrice(double highPrice) {
		this.highPrice = highPrice;
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

	

}
