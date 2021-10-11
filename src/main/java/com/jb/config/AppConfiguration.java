package com.jb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.jb")
@PropertySource("classpath:application.properties")
public class AppConfiguration {
}
