package com.SWII.Repositories;

import javax.transaction.Transactional;

import com.SWII.Entity.OnlineProductEntity;

@Transactional
public interface OnlineProductRepo extends ProductBasedRepository<OnlineProductEntity> {

}
