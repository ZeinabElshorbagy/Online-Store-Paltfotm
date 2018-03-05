package com.SWII.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.SWII.Entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,String> {
}
