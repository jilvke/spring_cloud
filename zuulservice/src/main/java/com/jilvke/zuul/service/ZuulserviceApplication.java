package com.jilvke.zuul.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @Author: JILVKE
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulserviceApplication.class, args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
