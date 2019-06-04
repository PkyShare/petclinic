package com.pky.petclinic.commons.domain;

import javax.persistence.*;

@Table(name = "petclinic..tb_drugs")
public class TbDrugs {
    /**
     * 药品编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 药品名称
     */
    @Column(name = "drugs_name")
    private String drugsName;

    /**
     * 药品类型
     */
    @Column(name = "drugs_type")
    private String drugsType;

    /**
     * 主要成分
     */
    @Column(name = "main_components")
    private String mainComponents;

    /**
     * 规格
     */
    private String specifications;

    /**
     * 适应症
     */
    private String indication;

    /**
     * 用法用量
     */
    @Column(name = "usage_dosage")
    private String usageDosage;

    /**
     * 厂家
     */
    private String manufacturer;

    /**
     * 供货单位
     */
    @Column(name = "supply_unit")
    private String supplyUnit;

    /**
     * 保质期/月
     */
    @Column(name = "quality_guarantee_period")
    private Long qualityGuaranteePeriod;

    /**
     * 获取药品编号
     *
     * @return id - 药品编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置药品编号
     *
     * @param id 药品编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取药品名称
     *
     * @return drugs_name - 药品名称
     */
    public String getDrugsName() {
        return drugsName;
    }

    /**
     * 设置药品名称
     *
     * @param drugsName 药品名称
     */
    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName;
    }

    /**
     * 获取药品类型
     *
     * @return drugs_type - 药品类型
     */
    public String getDrugsType() {
        return drugsType;
    }

    /**
     * 设置药品类型
     *
     * @param drugsType 药品类型
     */
    public void setDrugsType(String drugsType) {
        this.drugsType = drugsType;
    }

    /**
     * 获取主要成分
     *
     * @return main_components - 主要成分
     */
    public String getMainComponents() {
        return mainComponents;
    }

    /**
     * 设置主要成分
     *
     * @param mainComponents 主要成分
     */
    public void setMainComponents(String mainComponents) {
        this.mainComponents = mainComponents;
    }

    /**
     * 获取规格
     *
     * @return specifications - 规格
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * 设置规格
     *
     * @param specifications 规格
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    /**
     * 获取适应症
     *
     * @return indication - 适应症
     */
    public String getIndication() {
        return indication;
    }

    /**
     * 设置适应症
     *
     * @param indication 适应症
     */
    public void setIndication(String indication) {
        this.indication = indication;
    }

    /**
     * 获取用法用量
     *
     * @return usage_dosage - 用法用量
     */
    public String getUsageDosage() {
        return usageDosage;
    }

    /**
     * 设置用法用量
     *
     * @param usageDosage 用法用量
     */
    public void setUsageDosage(String usageDosage) {
        this.usageDosage = usageDosage;
    }

    /**
     * 获取厂家
     *
     * @return manufacturer - 厂家
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 设置厂家
     *
     * @param manufacturer 厂家
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * 获取供货单位
     *
     * @return supply_unit - 供货单位
     */
    public String getSupplyUnit() {
        return supplyUnit;
    }

    /**
     * 设置供货单位
     *
     * @param supplyUnit 供货单位
     */
    public void setSupplyUnit(String supplyUnit) {
        this.supplyUnit = supplyUnit;
    }

    /**
     * 获取保质期/月
     *
     * @return quality_guarantee_period - 保质期/月
     */
    public Long getQualityGuaranteePeriod() {
        return qualityGuaranteePeriod;
    }

    /**
     * 设置保质期/月
     *
     * @param qualityGuaranteePeriod 保质期/月
     */
    public void setQualityGuaranteePeriod(Long qualityGuaranteePeriod) {
        this.qualityGuaranteePeriod = qualityGuaranteePeriod;
    }
}