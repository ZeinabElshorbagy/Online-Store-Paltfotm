<<<<<<< Updated upstream
package com.SWII.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StoreProductsEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store stores;

	
	@ManyToOne
	@JoinColumn(name = "product_id")	
	private Product products;
	
	private Integer numberOfViews;

	public StoreProductsEntity(Store stores, Product products, Integer numberOfViews) {
		super();
		this.stores = stores;
		this.products = products;
		this.numberOfViews = numberOfViews;
	}

	public Store getStores() {
		return stores;
	}

	public void setStores(Store stores) {
		this.stores = stores;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	public Integer getNumberOfViews() {
		return numberOfViews;
	}

	public void setNumberOfViews(Integer numberOfViews) {
		this.numberOfViews = numberOfViews;
	}

	public StoreProductsEntity() {
		super();
	}
}
//package com.SWII.Entity;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//
//@Entity
//public class StoreProductsEntity {
//	
//	@Id
//	@GeneratedValue (strategy = GenerationType.AUTO)
//	int id;
//
//	@OneToMany
//	@JoinColumn(name = "Store_id")
//	private Store store;
//	
//	@OneToMany
//	@JoinColumn(name = "Product_id")
//	private Product product;
//
//	private Integer numberOfViews;
//
//	
//	public StoreProductsEntity(Store store, Product product) {
//		super();
//		this.store = store;
//		this.product = product;
//		this.numberOfViews = 0;
//
//	}
//
//}
