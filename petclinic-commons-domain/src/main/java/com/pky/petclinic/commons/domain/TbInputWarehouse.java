package com.pky.petclinic.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "tb_input_warehouse")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbInputWarehouse extends AbstractBaseDomain {

    private static final long serialVersionUID = 4059971898912064329L;
    /**
     * 药品编号
     */
    @Column(name = "drugs_id")
    @NotNull(message = "药品编号不可为空")
    private Long drugsId;

    /**
     * 药品商品名称
     */
    @Column(name = "drugs_name")
    private String drugsName;

    /**
     * 入库时间
     */
    @Column(name = "input_warehouse_date")
    private Date inputWarehouseDate;

    /**
     * 入库数量
     */
    @Column(name = "input_warehouse_num")
    @NotNull(message = "入库数量不可为空")
    private Long inputWarehouseNum;

    /**
     * 进价
     */
    @Column(name = "purchase_price")
    @NotNull(message = "进价不可为空")
    private Long purchasePrice;

    /**
     * 总金额
     */
    @Column(name = "total_sum")
    private Long totalSum;

    /**
     * 生产批号
     */
    @Column(name = "batch_num")
    private String batchNum;

    /**
     * 获取药品编号
     *
     * @return drugs_id - 药品编号
     */
    public Long getDrugsId() {
        return drugsId;
    }

    /**
     * 设置药品编号
     *
     * @param drugsId 药品编号
     */
    public void setDrugsId(Long drugsId) {
        this.drugsId = drugsId;
    }

    /**
     * 获取药品商品名称
     *
     * @return drugs_name - 药品商品名称
     */
    public String getDrugsName() {
        return drugsName;
    }

    /**
     * 设置药品商品名称
     *
     * @param drugsName 药品商品名称
     */
    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName;
    }

    /**
     * 获取入库时间
     *
     * @return input_warehouse_date - 入库时间
     */
    public Date getInputWarehouseDate() {
        return inputWarehouseDate;
    }

    /**
     * 设置入库时间
     *
     * @param inputWarehouseDate 入库时间
     */
    public void setInputWarehouseDate(Date inputWarehouseDate) {
        this.inputWarehouseDate = inputWarehouseDate;
    }

    /**
     * 获取入库数量
     *
     * @return input_warehouse_num - 入库数量
     */
    public Long getInputWarehouseNum() {
        return inputWarehouseNum;
    }

    /**
     * 设置入库数量
     *
     * @param inputWarehouseNum 入库数量
     */
    public void setInputWarehouseNum(Long inputWarehouseNum) {
        this.inputWarehouseNum = inputWarehouseNum;
    }

    /**
     * 获取进价
     *
     * @return purchase_price - 进价
     */
    public Long getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * 设置进价
     *
     * @param purchasePrice 进价
     */
    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * 获取总金额
     *
     * @return total_sum - 总金额
     */
    public Long getTotalSum() {
        return totalSum;
    }

    /**
     * 设置总金额
     *
     * @param totalSum 总金额
     */
    public void setTotalSum(Long totalSum) {
        this.totalSum = totalSum;
    }

    /**
     * 获取生产批号
     *
     * @return batch_num - 生产批号
     */
    public String getBatchNum() {
        return batchNum;
    }

    /**
     * 设置生产批号
     *
     * @param batchNum 生产批号
     */
    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }
}
