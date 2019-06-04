package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbRegister;
import com.pky.petclinic.commons.domain.TbWatinglist;
import com.pky.petclinic.commons.mapper.TbRegisterMapper;
import com.pky.petclinic.commons.mapper.TbWatinglistMapper;
import com.pky.petclinic.commons.service.TbRegisterService;
import com.pky.petclinic.commons.service.TbWatingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * 挂号逻辑层
 */
@Service
@Transactional
public class TbRegisterServiceImpl extends BaseCrudServiceImpl<TbRegister, TbRegisterMapper> implements TbRegisterService {

    @Autowired
    TbWatingListService watingListService;

    @Override
    public TbRegister save(TbRegister domain) {
        int result = 0;

        //新增
        if(domain.getId() == null){

            //设置挂号时间
            domain.setCreated(new Date());
            result = mapper.insertUseGeneratedKeys(domain);

            //创建诊断队列
            TbWatinglist watinglist = new TbWatinglist();
            watinglist.setCardId(domain.getCardId());
            watinglist.setRegisterId(domain.getId());
            watinglist.setPetname(domain.getPetname());
            watinglist.setUsername(domain.getUsername());
            watinglist.setCreated(new Date());
            watinglist.setWaitDiagnosisType("等待");

            watingListService.saveToReg(watinglist);
        }

        //修改
        else{
            result = mapper.updateByPrimaryKey(domain);
        }

        //保存入库数据
        if(result > 0){
            return domain;
        }
        return null;
    }
}
