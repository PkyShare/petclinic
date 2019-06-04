package com.pky.petclinic.web.admin.controller;

import com.pky.petclinic.commons.domain.TbUser;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.dto.BaseResultFactory;
import com.pky.petclinic.commons.service.LoginServic;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping(value = "v1/login")
public class LoginController extends AbstractBaseController<TbUser> {

    @Autowired
    private LoginServic loginServic;

    @PostMapping(value = "")
    public AbstractBaseResult login(TbUser tbUser){

        if(StringUtils.isBlank(tbUser.getUsername())){
            return error("用户名不可为空！", null);
        }

        if(StringUtils.isBlank(tbUser.getPassword())){
            return error("密码不可为空！", null);
        }

        TbUser user = loginServic.getLogin(tbUser);
        if(user != null){
            //获取权限
            tbUser.setJurisdiction(user.getJurisdiction());
            //登录成功，将登录账户存入 session
            request.getSession().setAttribute("tbUser", tbUser);
            return success(request.getRequestURI(),tbUser);
        }
        return error("用户名或密码错误！请重试", null);
    }
}
