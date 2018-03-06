package com.SWII.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.SWII.Entity.Product;


@NoRepositoryBean
public interface ProductBasedRepository<product extends Product> extends CrudRepository<product,Integer>{
	
	//public product findByEmail(String email);	
}
