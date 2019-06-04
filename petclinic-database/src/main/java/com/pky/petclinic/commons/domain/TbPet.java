package com.pky.petclinic.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "petclinic..tb_pet")
public class TbPet {
    /**
     * 卡号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 宠物主人姓名
     */
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
    private String petname;

    /**
     * 宠物性别,0为母，1为公
     */
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
     * 获取卡号
     *
     * @return id - 卡号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置卡号
     *
     * @param id 卡号
     */
    public void setId(Long id) {
        this.id = id;
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