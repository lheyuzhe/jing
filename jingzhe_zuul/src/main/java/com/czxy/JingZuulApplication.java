package com.czxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by ASUS on 2020/4/1.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class JingZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(JingZuulApplication.class,args);
    }
}
