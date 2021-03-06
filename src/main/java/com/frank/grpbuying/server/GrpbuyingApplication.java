package com.frank.grpbuying.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = "com.frank.grpbuying")
public class GrpbuyingApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpbuyingApplication.class, args);
    }

}
