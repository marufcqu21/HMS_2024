package com.maruf.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
		}
)
public class HmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmsApplication.class, args);
	}

}
