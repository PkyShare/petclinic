package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbPrescription;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbPrescriptionService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * 处方控制层
 */
@RestController
@RequestMapping(value = "v1/prescription")
@CrossOrigin
public class TbPrescriptionController extends AbstractBaseController<TbPrescription> {

    @Autowired
    private TbPrescriptionService prescriptionService;

    @PostMapping(value = "")
    public AbstractBaseResult save(TbPrescription tbPrescription){
        //数据校验
        String message = BeanValidator.validator(tbPrescription);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //保存宠物信息
        TbPrescription prescription = prescriptionService.save(tbPrescription);
        if(prescription != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),prescription);
        }

        return error("保存失败，请重试", null);
    }

    /**
     * 分页查询
     * @param num
     * @param size
     * @return
     */
    @GetMapping(value = "page/{num}/{size}")
    public AbstractBaseResult page(@PathVariable int num, @PathVariable int size){

        PageInfo<TbPrescription> pageInfo = prescriptionService.page(null, num, size);
        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    @DeleteMapping(value = "{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = prescriptionService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        return error("删除失败",null);
    }
}
