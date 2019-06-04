package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbDrugs;
import com.pky.petclinic.commons.domain.TbPet;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbPetService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.commons.utils.RegexpUtils;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/pets")
@CrossOrigin
public class TbPetController extends AbstractBaseController<TbPet> {

    @Autowired
    private TbPetService tbPetService;

    /**
     * 保存值班信息
     * @param tbPets
     * @return
     */
    @PostMapping(value = "")
    public AbstractBaseResult save(TbPet tbPets){

        //数据校验
        String message = BeanValidator.validator(tbPets);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //校验宠物名是否重复
        if(!tbPetService.unique("petname", tbPets.getPetname())){
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return error("宠物名重复,请重试", null);
        }

        //保存宠物信息
        TbPet pets = tbPetService.save(tbPets);
        if(pets != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),pets);
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
        PageInfo<TbPet> pageInfo = tbPetService.page(null, num, size);
        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = tbPetService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        return error("删除失败",null);
    }
}
