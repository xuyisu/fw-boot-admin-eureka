package com.yisu.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FwServiceBApplication {
    public static void main(String[] args) {
        SpringApplication.run(FwServiceBApplication.class, args);
    }


}