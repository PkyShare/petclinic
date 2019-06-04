package com.pky.petclinic.commons.domain;

import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 医生姓名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 注册手机号
     */
    private String phone;

    /**
     * 注册邮箱
     */
    private String email;

    /**
     * 权限,0/前台工作人，1/医生,2/仓库人员,3/管理员
     */
    private Long jurisdiction;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取医生姓名
     *
     * @return username - 医生姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置医生姓名
     *
     * @param username 医生姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
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
     * 获取注册邮箱
     *
     * @return email - 注册邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置注册邮箱
     *
     * @param email 注册邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取权限,0/前台工作人，1/医生,2/仓库人员,3/管理员
     *
     * @return jurisdiction - 权限,0/前台工作人，1/医生,2/仓库人员,3/管理员
     */
    public Long getJurisdiction() {
        return jurisdiction;
    }

    /**
     * 设置权限,0/前台工作人，1/医生,2/仓库人员,3/管理员
     *
     * @param jurisdiction 权限,0/前台工作人，1/医生,2/仓库人员,3/管理员
     */
    public void setJurisdiction(Long jurisdiction) {
        this.jurisdiction = jurisdiction;
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