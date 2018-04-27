package com.SWII.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.SWII.Entity.StoreEntity;

public interface StoreRepository  extends CrudRepository<StoreEntity,Integer>{
		public StoreEntity findByName(String name);
}
