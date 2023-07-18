package com.jtech.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class ApiCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCloudGatewayApplication.class, args);
	}

}
