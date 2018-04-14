package com.SWII.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class StoreEntity {

	private enum Type {
		online, offline;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int storeId;

	@OneToMany(mappedBy = "products", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<StoreProductsEntity> products;

	private Type type;
	private Boolean status;
	private String name;
	private Integer numberOfView;
	private Integer storeOwner;
 
	public StoreEntity(int storeId, Set<StoreProductsEntity> products, Type type, Boolean status, String name,
			Integer storeOwner) {
		super();
		this.storeId = storeId;
		this.products = products;
		this.type = type;
		this.numberOfView = 0;
		this.status = status;
		this.name = name;
		this.storeOwner = storeOwner;
	}

	public StoreEntity(int storeId) {
		super();
		this.storeId = storeId;
	}

	public StoreEntity() {
		super();
		status = false;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setType(String type) {
		this.type = Type.valueOf(type);
	}

	public Integer getStoreOwner() {
		return storeOwner;
	}

	public void setStoreOwner(Integer storeOwner) {
		this.storeOwner = storeOwner;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
