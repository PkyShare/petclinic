package com.pky.petclinic.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_doctor_duty")
public class TbDoctorDuty {
    /**
     * 值班编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 医生编号
     */
    @Column(name = "doctor_id")
    private Long doctorId;

    /**
     * 医生姓名
     */
    @Column(name = "doctor_name")
    private String doctorName;

    /**
     * 科室
     */
    private String department;

    /**
     * 级别,0/住院医师，1/主治医师,2/主任,3/教授
     */
    @Column(name = "docker_level")
    private Long dockerLevel;

    /**
     * 值班日期
     */
    @Column(name = "duty_date")
    private Date dutyDate;

    /**
     * 性别
     */
    private Long sex;

    /**
     * 出生日期
     */
    private Date birth;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取值班编号
     *
     * @return id - 值班编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置值班编号
     *
     * @param id 值班编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取医生编号
     *
     * @return doctor_id - 医生编号
     */
    public Long getDoctorId() {
        return doctorId;
    }

    /**
     * 设置医生编号
     *
     * @param doctorId 医生编号
     */
    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * 获取医生姓名
     *
     * @return doctor_name - 医生姓名
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * 设置医生姓名
     *
     * @param doctorName 医生姓名
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
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
     * 获取级别,0/住院医师，1/主治医师,2/主任,3/教授
     *
     * @return docker_level - 级别,0/住院医师，1/主治医师,2/主任,3/教授
     */
    public Long getDockerLevel() {
        return dockerLevel;
    }

    /**
     * 设置级别,0/住院医师，1/主治医师,2/主任,3/教授
     *
     * @param dockerLevel 级别,0/住院医师，1/主治医师,2/主任,3/教授
     */
    public void setDockerLevel(Long dockerLevel) {
        this.dockerLevel = dockerLevel;
    }

    /**
     * 获取值班日期
     *
     * @return duty_date - 值班日期
     */
    public Date getDutyDate() {
        return dutyDate;
    }

    /**
     * 设置值班日期
     *
     * @param dutyDate 值班日期
     */
    public void setDutyDate(Date dutyDate) {
        this.dutyDate = dutyDate;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Long getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Long sex) {
        this.sex = sex;
    }

    /**
     * 获取出生日期
     *
     * @return birth - 出生日期
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 设置出生日期
     *
     * @param birth 出生日期
     */
    public void setBirth(Date birth) {
        this.birth = birth;
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
