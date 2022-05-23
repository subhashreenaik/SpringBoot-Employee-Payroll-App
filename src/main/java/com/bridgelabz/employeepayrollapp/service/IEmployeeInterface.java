package com.bridgelabz.employeepayrollapp.service;

import java.util.List;
import java.util.Optional;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeeInterface {

	EmployeePayrollData addEmployee(EmployeePayrollDTO newEmployee);
	EmployeePayrollData editById(int id, EmployeePayrollDTO employee);
    EmployeePayrollData getEmployeePayrollDataById(int id);
    List <EmployeePayrollData> getEmployeePayrollData();
	
	
    

}
