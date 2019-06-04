package com.pky.petclinic.commons.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pky.petclinic.commons.dto.AbstractBaseDomain;
import lombok.Data;

import java.io.Serializable;


/**
 * 通用响应结果
 */
@Data
public class AbstractBaseResult implements Serializable {

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected static class Links{
        private String self;
        private String next;
        private String last;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected static class DataBean<T extends AbstractBaseDomain> {
        private String type;
        private Long id;
        private T attributes;
        private T relationships;
        private Links links;
    }
}
