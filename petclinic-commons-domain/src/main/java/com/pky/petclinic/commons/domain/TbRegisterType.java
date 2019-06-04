package com.pky.petclinic.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "tb_register_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbRegisterType extends AbstractBaseDomain {

    private static final long serialVersionUID = -3167722464162009955L;
    /**
     * 类型名称
     */
    @Column(name = "type_name")
    @NotNull(message = "挂号类型名称不可为空")
    private String typeName;

    /**
     * 价格
     */
    @NotNull(message = "价格不可为空")
    private Long price;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取类型名称
     *
     * @return type_name - 类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置类型名称
     *
     * @param typeName 类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
