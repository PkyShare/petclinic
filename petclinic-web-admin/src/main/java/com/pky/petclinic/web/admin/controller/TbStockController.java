package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbStock;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbStockService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/stocks")
@CrossOrigin
public class TbStockController extends AbstractBaseController<TbStock> {

    @Autowired
    private TbStockService stockService;


    /**
     * 保存仓库信息
     * @param tbStock
     * @return
     */
    @PostMapping(value = "")
    public AbstractBaseResult save(TbStock tbStock){
        //数据校验
        String message = BeanValidator.validator(tbStock);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //保存项目
        TbStock stock = stockService.save(tbStock);
        if(stock != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),stock);
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
        PageInfo<TbStock> pageInfo = stockService.page(null, num, size);

        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = stockService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        return error("删除失败",null);
    }
}
