package com.studentapp.studentclientreadupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentClientReadUpdateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentClientReadUpdateApiApplication.class, args);
	}

}
