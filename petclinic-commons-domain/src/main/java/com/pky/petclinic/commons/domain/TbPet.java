package com.pky.petclinic.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;
import org.hibernate.validator.constraints.Length;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "tb_pet")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbPet extends AbstractBaseDomain {

    private static final long serialVersionUID = -3249885119145617137L;
    /**
     * 宠物主人姓名
     */
    @NotNull(message = "宠物主人姓名不可为空")
    @Length(min = 2, max = 20, message = "用户名长度必须介于 2 和 20 之间")
    private String username;

    /**
     * 注册手机号
     */
    private String phone;

    /**
     * qq号
     */
    private String qq;

    /**
     * 宠物名
     */
    @NotNull(message = "宠物名不可为空")
    @Length(min = 2, max = 20, message = "用户名长度必须介于 2 和 20 之间")
    private String petname;

    /**
     * 宠物性别,0为母，1为公
     */
    @NotNull(message = "宠物性别不可为空")
    private Long sex;

    /**
     * 宠物出生日期
     */
    private Date birth;

    /**
     * 宠物种类,如狗，猫
     */
    private String breed;

    /**
     * 品种，如阿拉斯加犬，藏獒...
     */
    private String variety;

    /**
     * 宠物颜色
     */
    private String color;

    /**
     * 绝育,0为否，1为是
     */
    private Long sterilization;

    /**
     * 免疫
     */
    private String immune;

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
     * 获取注册手机号
     *
     * @return phone - 注册手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置注册手机号
     *
     * @param phone 注册手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取qq号
     *
     * @return qq - qq号
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置qq号
     *
     * @param qq qq号
     */
    public void setQq(String qq) {
        this.qq = qq;
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
     * 获取宠物性别,0为母，1为公
     *
     * @return sex - 宠物性别,0为母，1为公
     */
    public Long getSex() {
        return sex;
    }

    /**
     * 设置宠物性别,0为母，1为公
     *
     * @param sex 宠物性别,0为母，1为公
     */
    public void setSex(Long sex) {
        this.sex = sex;
    }

    /**
     * 获取宠物出生日期
     *
     * @return birth - 宠物出生日期
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 设置宠物出生日期
     *
     * @param birth 宠物出生日期
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * 获取宠物种类,如狗，猫
     *
     * @return breed - 宠物种类,如狗，猫
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置宠物种类,如狗，猫
     *
     * @param breed 宠物种类,如狗，猫
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * 获取品种，如阿拉斯加犬，藏獒...
     *
     * @return variety - 品种，如阿拉斯加犬，藏獒...
     */
    public String getVariety() {
        return variety;
    }

    /**
     * 设置品种，如阿拉斯加犬，藏獒...
     *
     * @param variety 品种，如阿拉斯加犬，藏獒...
     */
    public void setVariety(String variety) {
        this.variety = variety;
    }

    /**
     * 获取宠物颜色
     *
     * @return color - 宠物颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置宠物颜色
     *
     * @param color 宠物颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取绝育,0为否，1为是
     *
     * @return sterilization - 绝育,0为否，1为是
     */
    public Long getSterilization() {
        return sterilization;
    }

    /**
     * 设置绝育,0为否，1为是
     *
     * @param sterilization 绝育,0为否，1为是
     */
    public void setSterilization(Long sterilization) {
        this.sterilization = sterilization;
    }

    /**
     * 获取免疫
     *
     * @return immune - 免疫
     */
    public String getImmune() {
        return immune;
    }

    /**
     * 设置免疫
     *
     * @param immune 免疫
     */
    public void setImmune(String immune) {
        this.immune = immune;
    }
}
