package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbDrugs;
import com.pky.petclinic.commons.domain.TbRegister;
import com.pky.petclinic.commons.domain.TbRegisterType;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbRegisterService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/reg")
@CrossOrigin
public class TbRegisterController extends AbstractBaseController<TbRegister> {

    @Autowired
    private TbRegisterService tbRegisterService;


    /**
     * 保存信息
     * @param tbRegister
     * @return
     */
    @PostMapping(value = "")
    public AbstractBaseResult save(TbRegister tbRegister){

        //数据校验
        String message = BeanValidator.validator(tbRegister);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }


        //保存挂号信息
        TbRegister register = tbRegisterService.save(tbRegister);
        if(register != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),register);
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
        PageInfo<TbRegister> pageInfo = tbRegisterService.page(null, num, size);

        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = tbRegisterService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        return error("删除失败",null);
    }
}

