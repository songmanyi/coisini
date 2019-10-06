package com.work.bizuser.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.work.cloudcommon.advice"})
public class AdviceConfig {
}
