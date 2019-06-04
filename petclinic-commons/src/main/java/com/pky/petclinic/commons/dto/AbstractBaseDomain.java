package com.pky.petclinic.commons.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 通用的领域模型
 */
@Data
public class AbstractBaseDomain implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //用于 在json 中返回主键
    private Long id;
}
