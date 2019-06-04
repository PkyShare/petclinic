package com.pky.petclinic.commons.mapper;

import com.pky.petclinic.commons.domain.TbStock;
import tk.mybatis.mapper.MyMapper;

public interface TbStockMapper extends MyMapper<TbStock> {

    /**
     * 添加库存
     * @param stock
     * @return
     */
    public int input(TbStock stock);
}
