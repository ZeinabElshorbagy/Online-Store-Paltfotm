package com.SWII.Entity;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class OfflineStatistics implements Istatistics {

	@Autowired
	
	@Override
	public Set<Product> numberOfViews() {
		return null;

	}

	@Override
	public Set<Product> numberOfUsers() {
		return null;
	}

	@Override
	public Set<Product> mostOrdered() {
		return null;
	}

	@Override
	public Set<Product> mostBrand() {
		return null;
	}

}
