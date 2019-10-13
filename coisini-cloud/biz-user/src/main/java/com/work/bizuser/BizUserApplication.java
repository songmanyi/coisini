package com.work.bizuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableEurekaClient
@MapperScan("com.work.bizuser.mapper")
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class BizUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizUserApplication.class, args);
    }

}
