package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class})
@EnableEurekaClient
public class SuperAdminMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperAdminMicroserviceApplication.class, args);
	}

}
