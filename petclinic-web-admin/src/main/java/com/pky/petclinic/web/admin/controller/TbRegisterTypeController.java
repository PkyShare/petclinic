package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbRegisterType;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbRegisterTypeService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/reg_type")
@CrossOrigin
public class TbRegisterTypeController extends AbstractBaseController<TbRegisterType> {

    @Autowired
    private TbRegisterTypeService registerTypeService;

    /**
     * 保存挂号类型信息
     * @param tbRegisterType
     * @return
     */
    @PostMapping(value = "")
    public AbstractBaseResult save(TbRegisterType tbRegisterType){
        //数据校验
        String message = BeanValidator.validator(tbRegisterType);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //保存类型信息
        TbRegisterType registerType = registerTypeService.save(tbRegisterType);
        if(registerType != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),registerType);
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
        PageInfo<TbRegisterType> pageInfo = registerTypeService.page(null, num, size);

        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = registerTypeService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        return error("删除失败",null);
    }
}
