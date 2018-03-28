package com.SWII.Entity;

import javax.persistence.Entity;

@Entity
public class OfflineStoreEntity extends Store {

	

	public OfflineStoreEntity(String storeId) {
		super(storeId);
	}
	
	public OfflineStoreEntity() {
		super();
	}

}
