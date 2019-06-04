package com.pky.petclinic.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "petclinic..tb_case")
public class TbCase {
    /**
     * 挂号单号
     */
    @Id
    @Column(name = "register_id")
    private Long registerId;

    /**
     * 卡号
     */
    @Column(name = "card_id")
    private Long cardId;

    /**
     * 主诉
     */
    @Column(name = "main_suit")
    private String mainSuit;

    /**
     * 体重/kg
     */
    private Long weidth;

    /**
     * 体温/°C
     */
    private Long temperature;

    /**
     * 发病日期
     */
    @Column(name = "morbidity_date")
    private Date morbidityDate;

    /**
     * 诊疗日期
     */
    @Column(name = "diagnosis_date")
    private Date diagnosisDate;

    /**
     * 初步诊断结果
     */
    @Column(name = "first_diagnosis_res")
    private String firstDiagnosisRes;

    /**
     * 化验结果
     */
    @Column(name = "assay_res")
    private String assayRes;

    /**
     * 最终诊断结果
     */
    @Column(name = "end_diagnosis_res")
    private String endDiagnosisRes;

    /**
     * 处方号
     */
    @Column(name = "prescription_id")
    private String prescriptionId;

    /**
     * 医生
     */
    private String doctor;

    /**
     * 备注
     */
    private String remarks;

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
     * 获取卡号
     *
     * @return card_id - 卡号
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * 设置卡号
     *
     * @param cardId 卡号
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取主诉
     *
     * @return main_suit - 主诉
     */
    public String getMainSuit() {
        return mainSuit;
    }

    /**
     * 设置主诉
     *
     * @param mainSuit 主诉
     */
    public void setMainSuit(String mainSuit) {
        this.mainSuit = mainSuit;
    }

    /**
     * 获取体重/kg
     *
     * @return weidth - 体重/kg
     */
    public Long getWeidth() {
        return weidth;
    }

    /**
     * 设置体重/kg
     *
     * @param weidth 体重/kg
     */
    public void setWeidth(Long weidth) {
        this.weidth = weidth;
    }

    /**
     * 获取体温/°C
     *
     * @return temperature - 体温/°C
     */
    public Long getTemperature() {
        return temperature;
    }

    /**
     * 设置体温/°C
     *
     * @param temperature 体温/°C
     */
    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }

    /**
     * 获取发病日期
     *
     * @return morbidity_date - 发病日期
     */
    public Date getMorbidityDate() {
        return morbidityDate;
    }

    /**
     * 设置发病日期
     *
     * @param morbidityDate 发病日期
     */
    public void setMorbidityDate(Date morbidityDate) {
        this.morbidityDate = morbidityDate;
    }

    /**
     * 获取诊疗日期
     *
     * @return diagnosis_date - 诊疗日期
     */
    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    /**
     * 设置诊疗日期
     *
     * @param diagnosisDate 诊疗日期
     */
    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    /**
     * 获取初步诊断结果
     *
     * @return first_diagnosis_res - 初步诊断结果
     */
    public String getFirstDiagnosisRes() {
        return firstDiagnosisRes;
    }

    /**
     * 设置初步诊断结果
     *
     * @param firstDiagnosisRes 初步诊断结果
     */
    public void setFirstDiagnosisRes(String firstDiagnosisRes) {
        this.firstDiagnosisRes = firstDiagnosisRes;
    }

    /**
     * 获取化验结果
     *
     * @return assay_res - 化验结果
     */
    public String getAssayRes() {
        return assayRes;
    }

    /**
     * 设置化验结果
     *
     * @param assayRes 化验结果
     */
    public void setAssayRes(String assayRes) {
        this.assayRes = assayRes;
    }

    /**
     * 获取最终诊断结果
     *
     * @return end_diagnosis_res - 最终诊断结果
     */
    public String getEndDiagnosisRes() {
        return endDiagnosisRes;
    }

    /**
     * 设置最终诊断结果
     *
     * @param endDiagnosisRes 最终诊断结果
     */
    public void setEndDiagnosisRes(String endDiagnosisRes) {
        this.endDiagnosisRes = endDiagnosisRes;
    }

    /**
     * 获取处方号
     *
     * @return prescription_id - 处方号
     */
    public String getPrescriptionId() {
        return prescriptionId;
    }

    /**
     * 设置处方号
     *
     * @param prescriptionId 处方号
     */
    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
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