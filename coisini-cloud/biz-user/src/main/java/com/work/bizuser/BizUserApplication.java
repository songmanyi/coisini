package com.work.bizuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BizUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizUserApplication.class, args);
    }

}
