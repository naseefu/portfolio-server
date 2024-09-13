package com.xpain.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.xpain.controller","com.xpain.demo","com.xpain.entity","com.xpain.service"})
@SpringBootApplication
public class ReactSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringApplication.class, args);
	}

}
