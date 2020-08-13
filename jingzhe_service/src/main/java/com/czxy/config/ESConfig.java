package com.czxy.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by ASUS on 2020/4/13.
 */
@Configuration
public class ESConfig {
    @PostConstruct
    public void init() {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
    }
}
