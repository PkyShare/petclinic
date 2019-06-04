package com.pky.petclinic.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "tb_drugs_profit")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbDrugsProfit extends AbstractBaseDomain {

    private static final long serialVersionUID = -3309305643875323751L;
    /**
     * 药品名称
     */
    @Column(name = "drugs_name")
    @NotNull(message = "药品名称")
    private String drugsName;

    /**
     * 药品类型
     */
    @Column(name = "drugs_type")
    @NotNull(message = "药品类型不可为空")
    private String drugsType;

    /**
     * 零售价
     */
    @Column(name = "retail_price")
    @NotNull(message = "零售价不可为空")
    private Long retailPrice;

    /**
     * 销售额
     */
    @Column(name = "sales_amount")
    @NotNull(message = "销售额不可为空")
    private Long salesAmount;

    /**
     * 利润
     */
    private Long profit;

    /**
     * 备注
     */
    private String remarks;

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
     * 获取药品类型
     *
     * @return drugs_type - 药品类型
     */
    public String getDrugsType() {
        return drugsType;
    }

    /**
     * 设置药品类型
     *
     * @param drugsType 药品类型
     */
    public void setDrugsType(String drugsType) {
        this.drugsType = drugsType;
    }

    /**
     * 获取零售价
     *
     * @return retail_price - 零售价
     */
    public Long getRetailPrice() {
        return retailPrice;
    }

    /**
     * 设置零售价
     *
     * @param retailPrice 零售价
     */
    public void setRetailPrice(Long retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * 获取销售额
     *
     * @return sales_amount - 销售额
     */
    public Long getSalesAmount() {
        return salesAmount;
    }

    /**
     * 设置销售额
     *
     * @param salesAmount 销售额
     */
    public void setSalesAmount(Long salesAmount) {
        this.salesAmount = salesAmount;
    }

    /**
     * 获取利润
     *
     * @return profit - 利润
     */
    public Long getProfit() {
        return profit;
    }

    /**
     * 设置利润
     *
     * @param profit 利润
     */
    public void setProfit(Long profit) {
        this.profit = profit;
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
