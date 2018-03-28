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
<<<<<<< HEAD

		super(productId, null, lowPrice, highPrice, brand, category);
		// TODO Auto-generated constructor stub
	}

=======
		super(productId, null, lowPrice, highPrice, brand, category);
		// TODO Auto-generated constructor stub
	}
	
	
>>>>>>> 90701378de76dac987df6374b782d808f9bbbcb2

}
