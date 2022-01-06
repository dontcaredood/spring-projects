package com.sandy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.sandy.demo.*"})
@EnableAutoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SqliteHibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqliteHibernateDemoApplication.class, args);
	}

}
