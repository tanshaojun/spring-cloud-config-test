package com.example.spirngcloudconfigeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpirngCloudConfigEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpirngCloudConfigEurekaApplication.class, args);
    }

}
