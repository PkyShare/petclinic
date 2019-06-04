package com.pky.petclinic.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.pky.petclinic")
@MapperScan(basePackages = "com.pky.petclinic.commons.mapper")
@EnableTransactionManagement //开启事务支持
public class PetClinicWebAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetClinicWebAdminApplication.class,args);
    }
}
