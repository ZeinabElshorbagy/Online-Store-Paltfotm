package com.SWII.Entity;

import javax.persistence.Entity;

@Entity 
public class OnlineProductEntity  extends Product {

	public OnlineProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnlineProductEntity(String productId, String name, double lowPrice, double highPrice, String brand,
			String category) {
		super(productId, null, lowPrice, highPrice, brand, category);
		// TODO Auto-generated constructor stub
	}
	
}
