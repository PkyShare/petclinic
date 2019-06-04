package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbPrescription;
import com.pky.petclinic.commons.domain.TbWatinglist;
import com.pky.petclinic.commons.mapper.TbPrescriptionMapper;
import com.pky.petclinic.commons.service.TbPrescriptionService;
import com.pky.petclinic.commons.service.TbWatingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * 处方逻辑层
 */
@Service
@Transactional
public class TbPrescriptionServiceImpl extends BaseCrudServiceImpl<TbPrescription, TbPrescriptionMapper> implements TbPrescriptionService {

    @Autowired
    TbWatingListService watingListService;

    @Override
    public TbPrescription save(TbPrescription domain) {
        int result = 0;

        //新增
        if(domain.getId() == null){
            //判断挂号编号是否重复,存在/false
            boolean boo = unique("registerId", domain.getRegisterId());

            if(!boo){
                return null;
            }
            domain.setPrescriptionDate(new Date());
            domain.setTakeMedicineType("未取");
            //增加处方信息
            result = mapper.insertUseGeneratedKeys(domain);

            //修改诊断队列状态
            TbWatinglist watinglist = new TbWatinglist();
            watinglist.setRegisterId(domain.getRegisterId());
            watingListService.saveToPre(watinglist);

        }

        //通过修改
        else{
            Date upDate = domain.getPrescriptionDate();

            //判断是否存在该数据
            //存在
            if(!unique("id",domain.getId())){

                if(upDate == null){
                    domain.setPrescriptionDate(mapper.selectByPrimaryKey(domain).getPrescriptionDate());
                }
                result = mapper.updateByPrimaryKey(domain);

            }

            //不存在
            else {
                return null;
            }
        }

        //保存数据成功
        if(result > 0){
            return domain;
        }

        return null;
    }

    @Override
    public TbPrescription saveToOutput(TbPrescription domain) {

        //获取数据库中的处方，然后将取药状态改为“已取”
        TbPrescription tbPrescription = mapper.selectByPrimaryKey(domain);
        tbPrescription.setTakeMedicineType("已取");
        mapper.updateByPrimaryKey(tbPrescription);

        return tbPrescription;
    }
}
