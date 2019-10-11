package com.yisu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xuyisu
 * @date 2019/9/20
 */
@SpringBootApplication
@EnableEurekaServer
public class FwEureka {

    public static void main(String[] args) {
        SpringApplication.run(FwEureka.class);
    }
}
