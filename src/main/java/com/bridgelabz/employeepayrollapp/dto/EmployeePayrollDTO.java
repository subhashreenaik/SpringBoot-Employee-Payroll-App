package com.bridgelabz.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayrollDTO {
	
public int salary;
public String fullName;

//public EmployeePayrollDTO(String fullName, int salary) {
//	this.fullName=fullName;
//	this.salary=salary;
//}

}
