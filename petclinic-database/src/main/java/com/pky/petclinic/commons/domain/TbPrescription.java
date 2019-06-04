package com.pky.petclinic.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "petclinic..tb_prescription")
public class TbPrescription {
    /**
     * 处方号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 挂号单号
     */
    @Column(name = "register_id")
    private Long registerId;

    /**
     * 药品商品名称
     */
    @Column(name = "drugs_name")
    private String drugsName;

    /**
     * 总量
     */
    private Long counts;

    /**
     * 用法用量
     */
    @Column(name = "usage_and_dosage")
    private String usageAndDosage;

    /**
     * 医生
     */
    private String doctor;

    /**
     * 处方日期
     */
    @Column(name = "prescription_date")
    private Date prescriptionDate;

    /**
     * 收款员
     */
    private String cashier;

    /**
     * 获取处方号
     *
     * @return id - 处方号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置处方号
     *
     * @param id 处方号
     */
    public void setId(Long id) {
        this.id = id;
    }

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
}