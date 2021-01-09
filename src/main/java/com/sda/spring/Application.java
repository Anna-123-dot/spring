package com.sda.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(value={"testOutsider","com.sda.spring"})
@PropertySource({"classpath:person.properities"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}