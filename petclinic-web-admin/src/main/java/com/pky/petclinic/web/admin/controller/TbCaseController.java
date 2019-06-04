package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbCase;
import com.pky.petclinic.commons.domain.TbDoctorDuty;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbCaseService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/case")
@CrossOrigin
public class TbCaseController extends AbstractBaseController<TbCase> {

    @Autowired
    private TbCaseService tbCaseService;

    /**
     * 保存病例信息
     * @param tbCase
     * @return
     */
    @ResponseBody
    @PostMapping(value = "")
    public AbstractBaseResult save(TbCase tbCase){

        //数据校验
        String message = BeanValidator.validator(tbCase);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //保存值班信息
        TbCase tcase = tbCaseService.save(tbCase);
        if(tcase != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),tcase);
        }

        return error("保存失败，请重试", null);
    }

    /**
     * 用户分页查询
     * @param num
     * @param size
     * @return
     */
    @GetMapping(value = "page/{num}/{size}")
    public AbstractBaseResult page(@PathVariable int num, @PathVariable int size){
        PageInfo<TbCase> pageInfo = tbCaseService.page(null, num, size);

        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = tbCaseService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        return error("删除失败",null);
    }
}
