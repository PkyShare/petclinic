package com.pky.petclinic.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "tb_register")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbRegister extends AbstractBaseDomain {

    private static final long serialVersionUID = 6014467255640637633L;
    /**
     * 卡id
     */
    @Column(name = "card_id")
    @NotNull(message = "卡号不可为空")
    private Long cardId;

    /**
     * 宠物主人姓名
     */
    @NotNull(message = "宠物主人姓名不可为空")
    private String username;

    /**
     * 宠物名
     */
    @NotNull(message = "宠物名不可为空")
    private String petname;

    /**
     * 科室
     */
    @NotNull(message = "科室不可为空")
    private String department;

    /**
     * 医生
     */
    private String doctor;

    /**
     * 挂号类别
     */
    @Column(name = "register_type")
    @NotNull(message = "挂号类别不可为空")
    private String registerType;

    /**
     * 挂号费
     */
    @Column(name = "register_fee")
    @NotNull(message = "挂号费不可为空")
    private Long registerFee;

    /**
     * 收款员
     */
    @NotNull(message = "收款员不可为空")
    private String cashier;

    /**
     * 挂号日期
     */
    private Date created;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取卡id
     *
     * @return card_id - 卡id
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * 设置卡id
     *
     * @param cardId 卡id
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取宠物主人姓名
     *
     * @return username - 宠物主人姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置宠物主人姓名
     *
     * @param username 宠物主人姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取宠物名
     *
     * @return petname - 宠物名
     */
    public String getPetname() {
        return petname;
    }

    /**
     * 设置宠物名
     *
     * @param petname 宠物名
     */
    public void setPetname(String petname) {
        this.petname = petname;
    }

    /**
     * 获取科室
     *
     * @return department - 科室
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置科室
     *
     * @param department 科室
     */
    public void setDepartment(String department) {
        this.department = department;
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
     * 获取挂号类别
     *
     * @return register_type - 挂号类别
     */
    public String getRegisterType() {
        return registerType;
    }

    /**
     * 设置挂号类别
     *
     * @param registerType 挂号类别
     */
    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    /**
     * 获取挂号费
     *
     * @return register_fee - 挂号费
     */
    public Long getRegisterFee() {
        return registerFee;
    }

    /**
     * 设置挂号费
     *
     * @param registerFee 挂号费
     */
    public void setRegisterFee(Long registerFee) {
        this.registerFee = registerFee;
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
     * 获取挂号日期
     *
     * @return created - 挂号日期
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置挂号日期
     *
     * @param created 挂号日期
     */
    public void setCreated(Date created) {
        this.created = created;
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
