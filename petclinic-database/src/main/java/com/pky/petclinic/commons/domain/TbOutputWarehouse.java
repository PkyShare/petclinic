package com.pky.petclinic.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "petclinic..tb_output_warehouse")
public class TbOutputWarehouse {
    /**
     * 出库编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 入库编号
     */
    @Column(name = "input_id")
    private Long inputId;

    /**
     * 药品编号
     */
    @Column(name = "drugs_id")
    private Long drugsId;

    /**
     * 出库时间
     */
    @Column(name = "output_warehouse_date")
    private Date outputWarehouseDate;

    /**
     * 出库数量
     */
    @Column(name = "output_warehouse_num")
    private Long outputWarehouseNum;

    /**
     * 验收人
     */
    private String acceptor;

    /**
     * 领取单位
     */
    @Column(name = "receiving_unit")
    private String receivingUnit;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取出库编号
     *
     * @return id - 出库编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置出库编号
     *
     * @param id 出库编号
     */
    public void setId(Long id) {
        this.id = id;
    }

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