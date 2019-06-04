package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbOutputWarehouse;
import com.pky.petclinic.commons.domain.TbPrescription;
import com.pky.petclinic.commons.mapper.TbOutputWarehouseMapper;
import com.pky.petclinic.commons.service.TbOutputWarehouseService;
import com.pky.petclinic.commons.service.TbPrescriptionService;
import com.pky.petclinic.commons.service.TbStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class TbOutputWarehouseServiceImpl extends BaseCrudServiceImpl<TbOutputWarehouse, TbOutputWarehouseMapper> implements TbOutputWarehouseService {

    @Autowired
    TbStockService tbStockService;

    @Autowired
    TbPrescriptionService tbPrescriptionService;

    @Override
    public TbOutputWarehouse save(TbOutputWarehouse domain) {
        int result = 0;

        //新增
        if(domain.getId() == null){
            //设置出库时间
            domain.setOutputWarehouseDate(new Date());
            result = mapper.insertUseGeneratedKeys(domain);

            //修改处方的取药状态
            TbPrescription tbPrescription = new TbPrescription();
            tbPrescription.setId(domain.getPreId());
            tbPrescriptionService.saveToOutput(tbPrescription);
        }

        //修改
        else{
            //获取改变后的差值
            long sub = domain.getOutputWarehouseNum() - mapper.selectByPrimaryKey(domain).getOutputWarehouseNum();
            result = mapper.updateByPrimaryKey(domain);

            domain.setOutputWarehouseNum(sub);
        }
        //修改库存
        tbStockService.save(domain);

        //保存入库数据
        if(result > 0){
            return domain;
        }
        return null;
    }

}
