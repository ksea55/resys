package org.resys.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetflixApp {
    public static void main(String[] args) {
        SpringApplication.run(NetflixApp.class, args);
    }
}
