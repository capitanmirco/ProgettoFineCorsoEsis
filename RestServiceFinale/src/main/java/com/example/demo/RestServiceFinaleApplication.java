package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EnableJpaRepositories("progetto.finale.jpa.respository")
@ComponentScan({"progetto.finale.jpa"})
@EntityScan("progetto.finale.jpa.entity")
public class RestServiceFinaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceFinaleApplication.class, args);
	}

}
