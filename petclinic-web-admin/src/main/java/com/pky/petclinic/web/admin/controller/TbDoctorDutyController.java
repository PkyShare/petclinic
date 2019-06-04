package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbDoctorDuty;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbDoctorDutyService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/doctors")
@CrossOrigin
public class TbDoctorDutyController extends AbstractBaseController<TbDoctorDuty> {

    @Autowired
    private TbDoctorDutyService doctorDutyService;


    /**
     * 保存值班信息
     * @param doctorDuty
     * @return
     */
    @PostMapping(value = "")
    public AbstractBaseResult save(TbDoctorDuty doctorDuty){

        //数据校验
        String message = BeanValidator.validator(doctorDuty);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //保存值班信息
        TbDoctorDuty duty = doctorDutyService.save(doctorDuty);
        if(duty != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),duty);
        }

        return error("保存失败，请重试", null);
    }

    /**
     * 值班分页查询
     * @param num
     * @param size
     * @return
     */
    @GetMapping(value = "page/{num}/{size}")
    public AbstractBaseResult page(@PathVariable int num, @PathVariable int size){
        PageInfo<TbDoctorDuty> pageInfo = doctorDutyService.page(null, num, size);

        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = doctorDutyService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        return error("删除失败",null);
    }
}
