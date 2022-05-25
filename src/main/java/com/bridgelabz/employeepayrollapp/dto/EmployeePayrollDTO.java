package com.bridgelabz.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayrollDTO {

@Min(value=500,message="Minimum wage should be more than 500")
public int salary;

@NotEmpty(message="Name canot be null")
@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name invalid")
public String fullName;

//public EmployeePayrollDTO(String fullName, int salary) {
//	this.fullName=fullName;
//	this.salary=salary;
//}

}
