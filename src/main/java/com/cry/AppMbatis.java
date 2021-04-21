package com.cry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cry.mapper")
public class AppMbatis {
	public static void main(String[] args) {
		SpringApplication.run(AppMbatis.class, args);
	}
}
