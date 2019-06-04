package com.pky.petclinic.commons.service;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;

/**
 * 通用业务逻辑接口
 */
public interface BaseCrudService<T extends AbstractBaseDomain> {

    /**
     * 查询属性值是否唯一
     * @param property
     * @param value
     * @return true/唯一，false/不唯一
     */
    default boolean unique(String property, String value) {
        return false;
    }

    default boolean unique(String property, Long value) {
        return false;
    }

    /**
     * 保存
     * @param domain
     * @return
     */
    default T save(T domain){
        return null;
    }

    /**
     * 分页查询
     * @param domain
     * @param pageNum
     * @param pageSize
     * @return
     */
    default PageInfo<T> page(T domain, int pageNum, int pageSize){
        return null;
    }


    /**
     * 单个删除
     * @param id
     * @return
     */
    default boolean delete(Long id){
        return false;
    }
}
