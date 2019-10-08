package com.work.bizmenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.work.cloudcommon.client.api")
@EnableEurekaClient
@SpringBootApplication
public class BizMenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizMenuApplication.class, args);
    }

}
