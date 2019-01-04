package com.jilvke.config.client;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {
    private final Logger logger = Logger.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }


}
