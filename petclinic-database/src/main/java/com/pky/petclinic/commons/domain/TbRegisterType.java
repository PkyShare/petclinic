package com.pky.petclinic.commons.domain;

import javax.persistence.*;

@Table(name = "petclinic..tb_register_type")
public class TbRegisterType {
    /**
     * 挂号类型编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 类型名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 价格
     */
    private Long price;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取挂号类型编号
     *
     * @return id - 挂号类型编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置挂号类型编号
     *
     * @param id 挂号类型编号
     */
    public void setId(Long id) {
        this.id = id;
    }

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