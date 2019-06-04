package com.pky.petclinic.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "tb_prescription")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbPrescription extends AbstractBaseDomain {

    private static final long serialVersionUID = -4335031562568595786L;
    /**
     * 挂号单号
     */
    @Column(name = "register_id")
    @NotNull(message = "挂号单号不可为空")
    private Long registerId;

    /**
     * 药品商品名称
     */
    @Column(name = "drugs_name")
    @NotNull(message = "药品名称不可为空")
    private String drugsName;

    /**
     * 总量
     */
    @NotNull(message = "总量不可为空")
    private Long counts;

    /**
     * 用法用量
     */
    @Column(name = "usage_and_dosage")
    @NotNull(message = "用法用量不可为空")
    private String usageAndDosage;

    /**
     * 医生
     */
    @NotNull(message = "医生不可为空")
    private String doctor;

    /**
     * 处方日期
     */
    @Column(name = "prescription_date")
    private Date prescriptionDate;

    /**
     * 收款员
     */
    @NotNull(message = "收款员不可为空")
    private String cashier;

    /**
     * 取药状态
     */
    @Column(name = "take_medicine_type")
    private String takeMedicineType;

    /**
     * 获取挂号单号
     *
     * @return register_id - 挂号单号
     */
    public Long getRegisterId() {
        return registerId;
    }

    /**
     * 设置挂号单号
     *
     * @param registerId 挂号单号
     */
    public void setRegisterId(Long registerId) {
        this.registerId = registerId;
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
     * 获取总量
     *
     * @return counts - 总量
     */
    public Long getCounts() {
        return counts;
    }

    /**
     * 设置总量
     *
     * @param counts 总量
     */
    public void setCounts(Long counts) {
        this.counts = counts;
    }

    /**
     * 获取用法用量
     *
     * @return usage_and_dosage - 用法用量
     */
    public String getUsageAndDosage() {
        return usageAndDosage;
    }

    /**
     * 设置用法用量
     *
     * @param usageAndDosage 用法用量
     */
    public void setUsageAndDosage(String usageAndDosage) {
        this.usageAndDosage = usageAndDosage;
    }

    /**
     * 获取医生
     *
     * @return doctor - 医生
     */
    public String getDoctor() {
        return doctor;
    }

    /**
     * 设置医生
     *
     * @param doctor 医生
     */
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    /**
     * 获取处方日期
     *
     * @return prescription_date - 处方日期
     */
    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    /**
     * 设置处方日期
     *
     * @param prescriptionDate 处方日期
     */
    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    /**
     * 获取收款员
     *
     * @return cashier - 收款员
     */
    public String getCashier() {
        return cashier;
    }

    /**
     * 设置收款员
     *
     * @param cashier 收款员
     */
    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    /**
     * 获取取药状态
     *
     * @return  - 取药状态类型
     */
    public String getTakeMedicineType() {
        return takeMedicineType;
    }

    /**
     * 设置取药状态
     *
     * @param
     */
    public void setTakeMedicineType(String takeMedicineType) {
        this.takeMedicineType = takeMedicineType;
    }

}
