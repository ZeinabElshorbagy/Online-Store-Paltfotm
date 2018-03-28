package com.SWII.Repositories;

import javax.transaction.Transactional;

import com.SWII.Entity.OfflineProductEntity;

@Transactional
public interface OfflineProductRepo extends ProductBasedRepository<OfflineProductEntity> {

}
