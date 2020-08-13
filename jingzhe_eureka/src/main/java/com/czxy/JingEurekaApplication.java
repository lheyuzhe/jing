package com.czxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Random;

/**
 * Created by ASUS on 2020/4/1.
 */
@SpringBootApplication
@EnableEurekaServer
public class JingEurekaApplication {
    public static void main(String[] args) {
        Random random=new Random();
        SpringApplication.run(JingEurekaApplication.class,args);
    }
}
