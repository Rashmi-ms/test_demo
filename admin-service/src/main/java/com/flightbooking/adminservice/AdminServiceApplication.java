package com.flightbooking.adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.flightbooking.adminservice.service.AdminServiceImpl;

@SpringBootApplication
@EnableEurekaClient
@EnableMongoRepositories

public class AdminServiceApplication {
	
	@Bean
	public AdminServiceImpl getAdminServiceImpl() {
		return new AdminServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceApplication.class, args);
	}

}