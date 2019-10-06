package com.work.bizuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//@EnableFeignClients(basePackages = "com.work.cloudcommon.client")
@EnableEurekaClient
@SpringBootApplication
public class BizUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizUserApplication.class, args);
    }

}
