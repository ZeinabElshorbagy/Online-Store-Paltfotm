package com.SWII.Repositories;

import javax.transaction.Transactional;

import com.SWII.Entity.Product;

@Transactional
public interface ProductRepo<p extends Product> extends ProductBasedRepository<p>{

}
