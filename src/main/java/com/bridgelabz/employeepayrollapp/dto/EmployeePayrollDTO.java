package com.bridgelabz.employeepayrollapp.dto;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

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

@NotNull(message = "Profile pic can not be null...")
public String profilePic;
@NotBlank(message = "Please enter gender..")
public String gender;

@NotEmpty(message = "Please Enter the department at least 1")
@ElementCollection
@CollectionTable(name = "department",joinColumns =@JoinColumn(name="id"))
public List<String> department;

@NotNull(message = "Mobile number can not be Null")
public int mobileNumber;

@NotNull(message = "Date Should not be null...")
@JsonFormat(pattern="dd MM yyyy")
@PastOrPresent(message = "Enter valid date...")
public Date startDate;

@NotEmpty(message = "Notes can not be Empty")
public String notes;

//public EmployeePayrollDTO(String fullName, int salary) {
//	this.fullName=fullName;
//	this.salary=salary;
//}

}
