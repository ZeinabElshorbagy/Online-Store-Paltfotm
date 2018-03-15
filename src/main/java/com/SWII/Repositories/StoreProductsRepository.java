package com.SWII.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.SWII.Entity.Product;
import com.SWII.Entity.StoreProductsEntity;

public interface StoreProductsRepository extends CrudRepository<StoreProductsEntity,Integer> {
	
	public List<StoreProductsEntity> findBystores(String storeId);
}
