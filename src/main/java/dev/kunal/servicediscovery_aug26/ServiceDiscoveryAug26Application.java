package dev.kunal.servicediscovery_aug26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryAug26Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryAug26Application.class, args);
    }

}
