package com.pky.petclinic.commons.mapper;

import com.pky.petclinic.commons.domain.TbWatinglist;
import tk.mybatis.mapper.MyMapper;

public interface TbWatinglistMapper extends MyMapper<TbWatinglist> {

    public TbWatinglist getByType(String type);
}
