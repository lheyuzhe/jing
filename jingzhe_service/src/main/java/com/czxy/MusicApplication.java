package com.czxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by ASUS on 2020/4/1.
 */
@SpringBootApplication
@EnableEurekaClient
public class MusicApplication {
    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class,args);
    }
}
