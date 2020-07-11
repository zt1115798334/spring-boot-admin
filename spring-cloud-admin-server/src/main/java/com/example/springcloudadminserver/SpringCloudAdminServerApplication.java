package com.example.springcloudadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhang
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAdminServerApplication.class, args);
	}

}
