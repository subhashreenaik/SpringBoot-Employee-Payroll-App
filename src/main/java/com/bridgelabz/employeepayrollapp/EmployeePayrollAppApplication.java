package com.bridgelabz.employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Slf4j
public class EmployeePayrollAppApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollAppApplication.class, args);
		System.out.println("Employee payroll backend");
		//log.info("logging is started");
	}

}
