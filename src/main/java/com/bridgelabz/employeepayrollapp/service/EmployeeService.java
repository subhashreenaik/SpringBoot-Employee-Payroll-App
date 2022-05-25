package com.bridgelabz.employeepayrollapp.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@Service
public class EmployeeService implements IEmployeeInterface{
private List <EmployeePayrollData> employeelist = new ArrayList<>();

   
   public List <EmployeePayrollData> getEmployeePayrollData(){
	   return employeelist;
   }
   
   public EmployeePayrollData getEmployeePayrollDataById(int id){
	   return employeelist.stream().filter(empdata -> empdata.getId() == id)
			   .findFirst()
			   .orElseThrow(() ->new EmployeePayrollException("Employee not found"));
   }

   @Override
	public EmployeePayrollData addEmployee(EmployeePayrollDTO employee) {
		EmployeePayrollData newEmployee = new EmployeePayrollData(employeelist.size()+1,employee);
		employeelist.add(newEmployee);
	        return newEmployee;
	    }
	

    public EmployeePayrollData editById(int id, EmployeePayrollDTO employeeDTO) {
    	EmployeePayrollData newEmployee = this.getEmployeePayrollDataById(id);
    	newEmployee.setFullName(employeeDTO.fullName);
    	newEmployee.setSalary(employeeDTO.salary);
    	employeelist.set(id-1, newEmployee);
		return newEmployee;
    	
    }

	

    
}


