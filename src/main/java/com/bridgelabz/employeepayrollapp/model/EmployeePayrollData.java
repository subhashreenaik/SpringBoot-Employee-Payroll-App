package com.bridgelabz.employeepayrollapp.model;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;


@Entity

public @Data class EmployeePayrollData {
	
	@Id
	@GeneratedValue
	int id;
    String fullName;
    String profilePic;
    String gender;
    private List<String> department;
    int salary;
    int mobileNumber;
    LocalDate startDate;
    String notes;

    public EmployeePayrollData(int id, EmployeePayrollDTO employeeDTO) {
        this.id = id;
        this.fullName = employeeDTO.fullName;
        this.salary = employeeDTO.salary;
//        this.profilePic = employee.profilePic;
//        this.gender = employee.gender;
//        this.department = employee.department;
//        this.mobileNumber = employee.mobileNumber;
//        this.notes = employee.notes;
//        
//        this.startDate = employee.startDate;
    }

    
    

    
    public EmployeePayrollData(int id, String fullName, String profilePic, String gender, List<String> department, int salary, LocalDate startDate,int mobileNumber,String notes) {
        this.id = id;
        this.fullName = fullName;
        this.profilePic = profilePic;
        this.gender = gender;
        this.department = department;
        this.mobileNumber = mobileNumber;
        this.notes = notes;
        this.salary = salary;
        this.startDate = startDate;
    }

    public EmployeePayrollData(EmployeePayrollData employee) {
        this.id = employee.id;
        this.fullName = employee.fullName;
        this.profilePic = employee.profilePic;
        this.gender = employee.gender;
        this.department = employee.department;
        this.mobileNumber = employee.mobileNumber;
        this.notes = employee.notes;
        this.salary = employee.salary;
        this.startDate = employee.startDate;

    }

    public EmployeePayrollData() {

    }

    

    

    
    

    

    

    public EmployeePayrollData(EmployeePayrollDTO employeeDTO) {
        this.fullName = employeeDTO.fullName;
        this.salary = employeeDTO.salary;
//        this.profilePic = employeeDTO.profilePic;
//        this.gender = employeeDTO.gender;
//        this.department = employeeDTO.department;
//        this.mobileNumber = employeeDTO.mobileNumber;
//        this.notes = employeeDTO.notes;
//        
//        this.startDate = employeeDTO.startDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
//                ", profilePic='" + profilePic + '\'' +
//                ", gender='" + gender + '\'' +
//                ", department='" + department + '\'' +
//                
//                ", mobileNumber=" + mobileNumber +
//                ", startDate=" + startDate +
//                ", notes='" + notes + '\'' +
                '}';
    }
}