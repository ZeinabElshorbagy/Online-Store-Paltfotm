package com.SWII.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Store {

	@Id
	private String storeId;

	
    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<StoreProductsEntity> products;

	private Integer numberOfView;

	
	
	
	
	
	
	
	public Store(String storeId, Set<StoreProductsEntity> products, Integer numberOfView) {
		super();
		this.storeId = storeId;
		this.products = products;
		this.numberOfView = numberOfView;
	}
	
	

	public Store() {
		super();
	}



	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Set<StoreProductsEntity> getProducts() {
		return products;
	}

	public void setProducts(Set<StoreProductsEntity> products) {
		this.products = products;
	}

	public Integer getNumberOfView() {
		return numberOfView;
	}

	public void setNumberOfView(Integer numberOfView) {
		this.numberOfView = numberOfView;
	}


	
	
	

}
