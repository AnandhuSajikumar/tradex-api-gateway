package com.spring.tradexapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TradexApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradexApiGatewayApplication.class, args);
    }

}
