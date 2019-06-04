package com.pky.petclinic.commons.domain;

import javax.persistence.*;

@Table(name = "tb_project")
public class TbProject {
    /**
     * 项目编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 项目类型
     */
    @Column(name = "project_type")
    private String projectType;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取项目编号
     *
     * @return id - 项目编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置项目编号
     *
     * @param id 项目编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取项目名称
     *
     * @return project_name - 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取项目类型
     *
     * @return project_type - 项目类型
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * 设置项目类型
     *
     * @param projectType 项目类型
     */
    public void setProjectType(String projectType) {
        this.projectType = projectType;
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
