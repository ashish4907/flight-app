package com.home.MyFirstDemoSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MyFirstDemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstDemoSpringBootApplication.class, args);
		System.out.println("Hello world");

	}

}
