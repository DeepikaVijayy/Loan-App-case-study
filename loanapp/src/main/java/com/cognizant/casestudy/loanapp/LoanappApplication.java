package com.cognizant.casestudy.loanapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.cognizant.casestudy.loanapp.dao")
public class LoanappApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanappApplication.class, args);
	}

}
