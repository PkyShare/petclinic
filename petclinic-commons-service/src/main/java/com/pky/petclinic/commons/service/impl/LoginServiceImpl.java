package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbUser;
import com.pky.petclinic.commons.mapper.TbUserMapper;
import com.pky.petclinic.commons.service.LoginServic;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import tk.mybatis.mapper.entity.Example;


@Service
public class LoginServiceImpl extends BaseCrudServiceImpl<TbUser, TbUserMapper> implements LoginServic {

    @Override
    public TbUser getLogin(TbUser tbUser) {

        if(tbUser != null) {
            Example example = new Example(TbUser.class);
            example.createCriteria().andEqualTo("username", tbUser.getUsername());
            TbUser user = mapper.selectOneByExample(example);

            if(user != null && isSame(DigestUtils.md5DigestAsHex(tbUser.getPassword().getBytes()), user.getPassword())){
                return user;
            }
        }
        return null;
    }

    /**
     * 判断密码是否相等
     * @return
     */
    private boolean isSame(String password, String dbPassword){
        if(StringUtils.equals(password, dbPassword)){
            return true;
        }
        return false;
    }

}
