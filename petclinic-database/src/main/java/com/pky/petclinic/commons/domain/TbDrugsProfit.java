package com.pky.petclinic.commons.domain;

import javax.persistence.*;

@Table(name = "petclinic..tb_drugs_profit")
public class TbDrugsProfit {
    /**
     * 药品编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 药品名称
     */
    @Column(name = "drugs_name")
    private String drugsName;

    /**
     * 药品类型
     */
    @Column(name = "drugs_type")
    private String drugsType;

    /**
     * 零售价
     */
    @Column(name = "retail_price")
    private Long retailPrice;

    /**
     * 销售额
     */
    @Column(name = "sales_amount")
    private Long salesAmount;

    /**
     * 利润
     */
    private String profit;

    /**
     * 备注
     */
    private String remarks;

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
    public String getProfit() {
        return profit;
    }

    /**
     * 设置利润
     *
     * @param profit 利润
     */
    public void setProfit(String profit) {
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