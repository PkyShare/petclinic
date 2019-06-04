package com.pky.petclinic.commons.service;

import com.pky.petclinic.commons.domain.TbInputWarehouse;
import com.pky.petclinic.commons.domain.TbOutputWarehouse;
import com.pky.petclinic.commons.domain.TbStock;

public interface TbStockService extends BaseCrudService<TbStock> {

    /**
     * 通过入库改变库存信息
     * @param inputWarehouse
     */
    public void save(TbInputWarehouse inputWarehouse);

    /**
     * 通过出库改变库存信息
     * @param outputWarehouse
     */
    public void save(TbOutputWarehouse outputWarehouse);
}
