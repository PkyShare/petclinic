package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbDoctorDuty;
import com.pky.petclinic.commons.domain.TbUser;
import com.pky.petclinic.commons.mapper.TbDoctorDutyMapper;
import com.pky.petclinic.commons.mapper.TbUserMapper;
import com.pky.petclinic.commons.service.TbDoctorDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbDoctorDutyServiceImpl extends BaseCrudServiceImpl<TbDoctorDuty, TbDoctorDutyMapper> implements TbDoctorDutyService {

    @Autowired
    TbUserMapper userMapper;

    @Override
    public TbDoctorDuty save(TbDoctorDuty doctorDuty) {
        int result = 0;

        //新增值班信息
        if(doctorDuty.getId() == null){
            //判断用户表是否存在该医生
            TbUser user = userMapper.selectByPrimaryKey(doctorDuty.getDoctorId());

            if(user != null){
                result = mapper.insertUseGeneratedKeys(doctorDuty);
            }
        }
        //修改值班信息
        else{
            result = mapper.updateByPrimaryKey(doctorDuty);
        }

        //保存成功
        if(result > 0){
            return doctorDuty;
        }

        return null;
    }
}
