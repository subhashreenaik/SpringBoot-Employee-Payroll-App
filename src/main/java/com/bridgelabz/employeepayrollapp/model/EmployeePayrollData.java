package com.bridgelabz.employeepayrollapp.model;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;


@Entity
@Table(name="EmployeePayrollData")
public @Data class EmployeePayrollData {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="id")
	int id;
	
	@Column(name = "fullName")
    String fullName;
	
	@Column(name = "profilePic")
    String profilePic;
	
	@Column(name = "gender")
    String gender;
    
    @ElementCollection
    @CollectionTable(name = "department",joinColumns = @JoinColumn(name="id"))
    @Column(name = "department")
    private List<String> department;
    
    @Column(name = "salary")
    int salary;
    
    @Column(name = "mobileNumber")
    int mobileNumber;
    
    @Column(name = "startDate")
    Date startDate;
    
    @Column(name = "notes")
    String notes;

    public EmployeePayrollData(int id, EmployeePayrollDTO employeeDTO) {
        this.id = id;
        this.fullName = employeeDTO.fullName;
        this.salary = employeeDTO.salary;
        this.profilePic = employeeDTO.profilePic;
        this.gender = employeeDTO.gender;
        this.department = employeeDTO.department;
        this.mobileNumber = employeeDTO.mobileNumber;
        this.notes = employeeDTO.notes;
        
        this.startDate = employeeDTO.startDate;
    }

    
    

    
    public EmployeePayrollData(int id, String fullName, String profilePic, String gender, List<String> department, int salary, Date startDate,int mobileNumber,String notes) {
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

    
    public EmployeePayrollData(int id) {
        this.id = id;
    }
    

    
    

    

    

    public EmployeePayrollData(EmployeePayrollDTO employeeDTO) {
        this.fullName = employeeDTO.fullName;
        this.salary = employeeDTO.salary;
        this.profilePic = employeeDTO.profilePic;
        this.gender = employeeDTO.gender;
        this.department = employeeDTO.department;
        this.mobileNumber = employeeDTO.mobileNumber;
        this.notes = employeeDTO.notes;
        
        this.startDate = employeeDTO.startDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", profilePic='" + profilePic + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                
                ", mobileNumber=" + mobileNumber +
                ", startDate=" + startDate +
                ", notes='" + notes + '\'' +
                '}';
    }
}