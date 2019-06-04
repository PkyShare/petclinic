package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbUser;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbUserService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/users")
@CrossOrigin
public class TbUserController extends AbstractBaseController<TbUser> {

    @Autowired
    private TbUserService tbUserService;


    /**
     * 保存用户
     * @param tbUser
     * @return
     */
    @PostMapping(value = "")
    public AbstractBaseResult reg(TbUser tbUser){

        //数据校验
        String message = BeanValidator.validator(tbUser);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //保存用户
        tbUser.setPassword(DigestUtils.md5DigestAsHex(tbUser.getPassword().getBytes()));
        TbUser user = tbUserService.save(tbUser);
        if(user != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),user);
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
        PageInfo<TbUser> pageInfo = tbUserService.page(null, num, size);

        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = tbUserService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        //删除失败
        return error("删除失败，请重试",null);
    }

}
