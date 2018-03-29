package com.SWII.Entity;

import javax.persistence.Entity;

@Entity
public class OfflineProductEntity extends Product {

	public OfflineProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OfflineProductEntity(String productId, String name, double lowPrice, double highPrice, String brand,
			String category) {

		super(productId, null, lowPrice, highPrice, brand, category);
		// TODO Auto-generated constructor stub
	}
	
	

}
