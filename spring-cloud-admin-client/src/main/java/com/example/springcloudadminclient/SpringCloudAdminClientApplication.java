package com.example.springcloudadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudAdminClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAdminClientApplication.class, args);
	}

}
