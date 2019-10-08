package com.work.bizmenu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.work.cloudcommon.advice", "com.work.cloudcommon.client"})
public class BaseConfig {
}
