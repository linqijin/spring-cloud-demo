package com.landi.cloud.demousercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoUserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoUserCenterApplication.class, args);
    }

}
