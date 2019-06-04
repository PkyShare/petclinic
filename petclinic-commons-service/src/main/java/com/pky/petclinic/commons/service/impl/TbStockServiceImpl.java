package com.pky.petclinic.commons.service.impl;


import com.pky.petclinic.commons.domain.TbInputWarehouse;
import com.pky.petclinic.commons.domain.TbOutputWarehouse;
import com.pky.petclinic.commons.domain.TbStock;
import com.pky.petclinic.commons.mapper.TbStockMapper;
import com.pky.petclinic.commons.service.TbStockService;
import org.springframework.stereotype.Service;

/**
 * 库存逻辑层
 */
@Service
public class TbStockServiceImpl extends BaseCrudServiceImpl<TbStock, TbStockMapper> implements TbStockService {

    @Override
    public void save(TbInputWarehouse inputWarehouse) {

        TbStock stock = mapper.selectByPrimaryKey(inputWarehouse.getDrugsId());

        //新增库存信息
        if(stock == null){
            TbStock tbStock = new TbStock();
            tbStock.setDrugsName(inputWarehouse.getDrugsName());
            tbStock.setId(inputWarehouse.getDrugsId());
            tbStock.setStockNum(inputWarehouse.getInputWarehouseNum());
            mapper.insert(tbStock);
        }

        //修改
        else {
            stock.setStockNum(inputWarehouse.getInputWarehouseNum() + stock.getStockNum());
            mapper.updateByPrimaryKey(stock);
        }
    }

    @Override
    public void save(TbOutputWarehouse outputWarehouse) {
        TbStock tbStock = mapper.selectByPrimaryKey(outputWarehouse.getDrugsId());
        long sub = outputWarehouse.getOutputWarehouseNum();

        tbStock.setStockNum((tbStock.getStockNum() - outputWarehouse.getOutputWarehouseNum()));
        mapper.updateByPrimaryKey(tbStock);
    }


    @Override
    public TbStock save(TbStock domain) {
        int result = 0;

        TbStock tbStock = mapper.selectByPrimaryKey(domain);

        //新增
        if(tbStock == null){
            result = mapper.insert(domain);
        }

        //修改
        else {
            result = mapper.updateByPrimaryKey(domain);
        }

        if(result > 0){
            return domain;
        }
        return null;
    }

}
