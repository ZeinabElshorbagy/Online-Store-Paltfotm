package com.SWII.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.SWII.Entity.OnlineProductEntity;

public interface ProductRepository extends CrudRepository<OnlineProductEntity,Integer>{
	
	
}
