package com.bridgelabz.employeepayrollapp;
import org.hibernate.cfg.Environment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Slf4j
public class EmployeePayrollAppApplication {
	
	//private Environment environment;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext contex = SpringApplication.run(EmployeePayrollAppApplication.class, args);
		System.out.println("Employee payroll backend");
		log.info("logging is started");
		log.info("Employee payroll is started in {} environment",contex.getEnvironment().getProperty("environment"));
		log.info("Employee payroll DB user is {} ",System.getenv("username"));
	}

}
