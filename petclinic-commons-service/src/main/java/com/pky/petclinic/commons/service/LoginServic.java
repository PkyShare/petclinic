package com.pky.petclinic.commons.service;

import com.pky.petclinic.commons.domain.TbUser;

/**
 * 登录业务逻辑接口
 */
public interface LoginServic extends BaseCrudService<TbUser>{


    /**
     * 登录判断
     * @param tbUser
     * @return
     */
    TbUser getLogin(TbUser tbUser);
}
