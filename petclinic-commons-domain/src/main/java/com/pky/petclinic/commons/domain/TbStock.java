package com.pky.petclinic.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "tb_stock")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbStock extends AbstractBaseDomain {

    private static final long serialVersionUID = -4272414121383630189L;
    /**
     * 药品编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "药品编号不可为空")
    private Long id;

    /**
     * 药品名称
     */
    @Column(name = "drugs_name")
    private String drugsName;

    /**
     * 库存数量
     */
    @Column(name = "stock_num")
    @NotNull(message = "库存数量不可为空")
    private Long stockNum;

    /**
     * 获取药品编号
     *
     * @return id - 药品编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置药品编号
     *
     * @param id 药品编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取药品名称
     *
     * @return drugs_name - 药品名称
     */
    public String getDrugsName() {
        return drugsName;
    }

    /**
     * 设置药品名称
     *
     * @param drugsName 药品名称
     */
    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName;
    }

    /**
     * 获取库存数量
     *
     * @return stock_num - 库存数量
     */
    public Long getStockNum() {
        return stockNum;
    }

    /**
     * 设置库存数量
     *
     * @param stockNum 库存数量
     */
    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }
}
