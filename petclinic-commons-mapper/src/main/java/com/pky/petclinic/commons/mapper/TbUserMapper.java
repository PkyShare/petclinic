package com.pky.petclinic.commons.mapper;

import com.pky.petclinic.commons.domain.TbUser;
import com.pky.petclinic.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbUserMapper extends MyMapper<TbUser> {
}
