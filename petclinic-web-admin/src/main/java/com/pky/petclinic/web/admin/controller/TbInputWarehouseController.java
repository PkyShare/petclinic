package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbInputWarehouse;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbInputWarehouseService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/input_warehouse")
@CrossOrigin
public class TbInputWarehouseController extends AbstractBaseController<TbInputWarehouse> {

    @Autowired
    private TbInputWarehouseService inputWarehouseService;

    /**
     * 保存入库信息
     * @param inputWarehouse
     * @return
     */
    @PostMapping(value = "")
    public AbstractBaseResult input(TbInputWarehouse inputWarehouse){
        //数据校验
        String message = BeanValidator.validator(inputWarehouse);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //保存项目
        TbInputWarehouse input = inputWarehouseService.save(inputWarehouse);
        if(input != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),input);
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
        PageInfo<TbInputWarehouse> pageInfo = inputWarehouseService.page(null, num, size);

        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = inputWarehouseService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        //删除失败
        return error("删除失败，请重试",null);
    }
}
