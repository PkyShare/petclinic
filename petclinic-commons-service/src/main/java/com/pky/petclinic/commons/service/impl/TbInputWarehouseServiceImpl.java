package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbInputWarehouse;
import com.pky.petclinic.commons.mapper.TbInputWarehouseMapper;
import com.pky.petclinic.commons.mapper.TbStockMapper;
import com.pky.petclinic.commons.service.TbInputWarehouseService;
import com.pky.petclinic.commons.service.TbStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class TbInputWarehouseServiceImpl extends BaseCrudServiceImpl<TbInputWarehouse, TbInputWarehouseMapper> implements TbInputWarehouseService {

    @Autowired
    TbStockService tbStockService;

    @Override
    public TbInputWarehouse save(TbInputWarehouse domain) {
        int result = 0;

        //设置总金额
        domain.setTotalSum(domain.getPurchasePrice() * domain.getInputWarehouseNum());

        //新增
        if(domain.getId() == null){
            //设置入库时间
            domain.setInputWarehouseDate(new Date());
            result = mapper.insertUseGeneratedKeys(domain);
        }

        //修改
        else{
            long sub = domain.getInputWarehouseNum() - mapper.selectByPrimaryKey(domain).getInputWarehouseNum();
            result = mapper.updateByPrimaryKey(domain);
            domain.setInputWarehouseNum(sub);
        }

        //保存库存信息
        tbStockService.save(domain);

        //保存入库数据
        if(result > 0){
            return domain;
        }
        return null;
    }

}
