package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbInputWarehouse;
import com.pky.petclinic.commons.domain.TbOutputWarehouse;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbOutputWarehouseService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/output_warehouse")
@CrossOrigin
public class TbOutputWarehouseController extends AbstractBaseController<TbOutputWarehouse> {

    @Autowired
    TbOutputWarehouseService outputWarehouseService;

    /**
     * 保存出库信息
     * @param outputWarehouse
     * @return
     */
    @PostMapping(value = "")
    public AbstractBaseResult output(TbOutputWarehouse outputWarehouse){
        //数据校验
        String message = BeanValidator.validator(outputWarehouse);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //保存项目
        TbOutputWarehouse output = outputWarehouseService.save(outputWarehouse);
        if(output != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),output);
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
        PageInfo<TbOutputWarehouse> pageInfo = outputWarehouseService.page(null, num, size);

        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = outputWarehouseService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        //删除失败
        return error("删除失败，请重试",null);
    }
}
