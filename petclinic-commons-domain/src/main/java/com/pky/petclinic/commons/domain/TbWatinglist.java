package com.pky.petclinic.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "tb_watinglist")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbWatinglist extends AbstractBaseDomain {
    private static final long serialVersionUID = 8662662512545813871L;
    @Column(name = "card_id")
    private Long cardId;

    /**
     * 挂号单号
     */
    @Column(name = "register_id")
    private Long registerId;

    /**
     * 宠物主人姓名
     */
    private String username;

    /**
     * 宠物名
     */
    private String petname;

    /**
     * 待诊疗类型
     */
    @Column(name = "wait_diagnosis_type")
    private String waitDiagnosisType;

    /**
     * 入队时间
     */
    private Date created;


    /**
     * @return card_id
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * @param cardId
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
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
     * 获取待诊疗类型
     *
     * @return wait_diagnosis_type - 待诊疗类型
     */
    public String getWaitDiagnosisType() {
        return waitDiagnosisType;
    }

    /**
     * 设置待诊疗类型
     *
     * @param waitDiagnosisType 待诊疗类型
     */
    public void setWaitDiagnosisType(String waitDiagnosisType) {
        this.waitDiagnosisType = waitDiagnosisType;
    }


    /**
     * 获取入队时间
     * @return
     */
    public Date getCreated() {return created;}

    public void setCreated(Date created) {this.created = created;}
}
