package com.SWII.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.SWII.Entity.Store;

public interface StoreBasedRepository <store extends Store> extends CrudRepository<store,String> {

}
