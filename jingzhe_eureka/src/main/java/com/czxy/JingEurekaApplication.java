package com.czxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by ASUS on 2020/4/1.
 */
@SpringBootApplication
@EnableEurekaServer
public class JingEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(JingEurekaApplication.class,args);
    }
}
