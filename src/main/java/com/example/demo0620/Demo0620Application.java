package com.example.demo0620;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBootApplication:标注一个主程序类，说明是一个SpringBoot应用
 */
@SpringBootApplication
@RestController
public class Demo0620Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo0620Application.class, args);
	}

	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring";
	}
}
