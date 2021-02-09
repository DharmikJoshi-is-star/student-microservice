package com.studentapp.studenteurekaregistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentEurekaRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentEurekaRegisteryApplication.class, args);
	}

}
