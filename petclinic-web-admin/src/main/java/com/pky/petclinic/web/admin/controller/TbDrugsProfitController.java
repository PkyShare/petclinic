package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbDrugsProfit;
import com.pky.petclinic.commons.domain.TbInputWarehouse;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbDrugsProfitService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/drugs_profit")
@CrossOrigin
public class TbDrugsProfitController extends AbstractBaseController<TbDrugsProfit> {

    @Autowired
    private TbDrugsProfitService drugsProfitService;


    /**
     * 保存入库信息
     * @param tbDrugsProfit
     * @return
     */
    @PostMapping(value = "")
    public AbstractBaseResult input(TbDrugsProfit tbDrugsProfit){
        //数据校验
        String message = BeanValidator.validator(tbDrugsProfit);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //保存项目
        tbDrugsProfit.setProfit(tbDrugsProfit.getSalesAmount() - tbDrugsProfit.getRetailPrice());
        TbDrugsProfit drugsProfit = drugsProfitService.save(tbDrugsProfit);
        if(drugsProfit != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),drugsProfit);
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

        PageInfo<TbDrugsProfit> pageInfo = drugsProfitService.page(null, num, size);
        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    @DeleteMapping(value = "{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = drugsProfitService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        return error("删除失败",null);
    }
}
