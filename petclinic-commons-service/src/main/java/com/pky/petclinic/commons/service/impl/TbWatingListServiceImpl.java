package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbPrescription;
import com.pky.petclinic.commons.domain.TbWatinglist;
import com.pky.petclinic.commons.mapper.TbPrescriptionMapper;
import com.pky.petclinic.commons.mapper.TbWatinglistMapper;
import com.pky.petclinic.commons.service.TbWatingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * 诊断队列数据处理层
 */
@Transactional
@Service
public class TbWatingListServiceImpl extends BaseCrudServiceImpl<TbWatinglist, TbWatinglistMapper> implements TbWatingListService {

    @Autowired
    TbWatinglistMapper tbWatinglistMapper;


    //从开处方渠道修改
    @Override
    public TbWatinglist saveToPre(TbWatinglist domain) {
        int result = 0;

        //查询某一诊断队列
        Example example = new Example(TbWatinglist.class);
        example.createCriteria().andEqualTo("registerId", domain.getRegisterId());
        TbWatinglist tbWatinglist = mapper.selectOneByExample(example);

        //排队从"就诊"到”确诊“
        if("就诊".equals(tbWatinglist.getWaitDiagnosisType())){
            //设置就诊状态
            tbWatinglist.setWaitDiagnosisType("确诊");

            mapper.updateByPrimaryKey(tbWatinglist);
        }


        //成功
        if(result > 0) {
            return tbWatinglist;
        }
        return null;
    }

    //挂号新增就诊队列
    @Override
    public TbWatinglist saveToReg(TbWatinglist domain) {
        int result = 0;
        //新增就诊队列
        if("等待".equals(domain.getWaitDiagnosisType())) {
            result = mapper.insert(domain);
        }
        return null;
    }

    // 从就诊队列中修改
    @Override
    public TbWatinglist saveToList(TbWatinglist domain) {
        int result = 0;
        if(!"确诊".equals(domain.getWaitDiagnosisType())) {
            //修改就诊队列状态为"就诊"
            domain.setWaitDiagnosisType("就诊");
            domain.setCreated(new Date());
            result = mapper.updateByPrimaryKey(domain);
        }

        //成功
        if(result > 0) {
            return domain;
        }
        return null;
    }
}
