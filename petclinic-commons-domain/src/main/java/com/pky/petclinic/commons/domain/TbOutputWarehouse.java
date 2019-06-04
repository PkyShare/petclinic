package com.pky.petclinic.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "tb_output_warehouse")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbOutputWarehouse extends AbstractBaseDomain {

    private static final long serialVersionUID = 5924562703693018663L;
    /**
     * 入库编号
     */
    @Column(name = "input_id")
    @NotNull(message = "入库编号不可为空")
    private Long inputId;

    /**
     * 处方编号
     */
    @Column(name = "pre_id")
    private Long preId;

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
     * 出库时间
     */
    @Column(name = "output_warehouse_date")
    private Date outputWarehouseDate;

    /**
     * 出库数量
     */
    @Column(name = "output_warehouse_num")
    @NotNull(message = "出库数量不可为空")
    private Long outputWarehouseNum;

    /**
     * 验收人
     */
    @NotNull(message = "验收人不可为空")
    private String acceptor;

    /**
     * 领取单位
     */
    @Column(name = "receiving_unit")
    @NotNull(message = "领取单位不可为空")
    private String receivingUnit;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取入库编号
     *
     * @return input_id - 入库编号
     */
    public Long getInputId() {
        return inputId;
    }

    /**
     * 设置入库编号
     *
     * @param inputId 入库编号
     */
    public void setInputId(Long inputId) {
        this.inputId = inputId;
    }

    public Long getPreId() { return preId;}

    public void setPreId(Long preId) {this.preId = preId;}

    /**
     * 获取药品编号
     *
     * @return drugs_id - 药品编号
     */
    public Long getDrugsId() {
        return drugsId;
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
     * 设置药品编号
     *
     * @param drugsId 药品编号
     */
    public void setDrugsId(Long drugsId) {
        this.drugsId = drugsId;
    }

    /**
     * 获取出库时间
     *
     * @return output_warehouse_date - 出库时间
     */
    public Date getOutputWarehouseDate() {
        return outputWarehouseDate;
    }

    /**
     * 设置出库时间
     *
     * @param outputWarehouseDate 出库时间
     */
    public void setOutputWarehouseDate(Date outputWarehouseDate) {
        this.outputWarehouseDate = outputWarehouseDate;
    }

    /**
     * 获取出库数量
     *
     * @return output_warehouse_num - 出库数量
     */
    public Long getOutputWarehouseNum() {
        return outputWarehouseNum;
    }

    /**
     * 设置出库数量
     *
     * @param outputWarehouseNum 出库数量
     */
    public void setOutputWarehouseNum(Long outputWarehouseNum) {
        this.outputWarehouseNum = outputWarehouseNum;
    }

    /**
     * 获取验收人
     *
     * @return acceptor - 验收人
     */
    public String getAcceptor() {
        return acceptor;
    }

    /**
     * 设置验收人
     *
     * @param acceptor 验收人
     */
    public void setAcceptor(String acceptor) {
        this.acceptor = acceptor;
    }

    /**
     * 获取领取单位
     *
     * @return receiving_unit - 领取单位
     */
    public String getReceivingUnit() {
        return receivingUnit;
    }

    /**
     * 设置领取单位
     *
     * @param receivingUnit 领取单位
     */
    public void setReceivingUnit(String receivingUnit) {
        this.receivingUnit = receivingUnit;
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
