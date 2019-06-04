package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbUser;
import com.pky.petclinic.commons.mapper.TbUserMapper;
import com.pky.petclinic.commons.service.TbUserService;
import org.springframework.stereotype.Service;

/**
 * 用户管理逻辑层
 */
@Service
public class TbUserServiceImpl extends BaseCrudServiceImpl<TbUser, TbUserMapper> implements TbUserService {
}
