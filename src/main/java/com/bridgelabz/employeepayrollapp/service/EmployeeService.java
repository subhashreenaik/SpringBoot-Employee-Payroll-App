package com.bridgelabz.employeepayrollapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.Repo.EmployeePayrollRepository;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

import lombok.extern.slf4j.Slf4j;

@Service

public class EmployeeService implements IEmployeeInterface{
	
	@Autowired
	EmployeePayrollRepository repo;
	
	
   private List <EmployeePayrollData> employeelist = new ArrayList<>();

   
   public List <EmployeePayrollData> getEmployeePayrollData(){
	   return repo.findAll();
   }
   
   public EmployeePayrollData getEmployeePayrollDataById(int id){
	   return repo.findById(id)
			   .orElseThrow(() ->new EmployeePayrollException("Employee not found"));
   }

   @Override
	public EmployeePayrollData addEmployee(EmployeePayrollDTO employee) {
		EmployeePayrollData newEmployee = new EmployeePayrollData(employeelist.size()+1,employee);
		employeelist.add(newEmployee);
	        return repo.save(newEmployee);
	    }
	

    public EmployeePayrollData editById(int id, EmployeePayrollDTO employeeDTO) {
    	EmployeePayrollData newEmployee = this.getEmployeePayrollDataById(id);
    	newEmployee.setFullName(employeeDTO.fullName);
    	newEmployee.setSalary(employeeDTO.salary);
    	newEmployee.setGender(employeeDTO.gender);
    	newEmployee.setMobileNumber(employeeDTO.mobileNumber);
    	newEmployee.setDepartment(employeeDTO.department);
    	newEmployee.setNotes(employeeDTO.notes);
    	newEmployee.setStartDate(employeeDTO.startDate);
    	newEmployee.setProfilePic(employeeDTO.profilePic);
    	employeelist.set(id-1, newEmployee);
		return repo.save(newEmployee);
    	
    }
    @Override
    public void deleteEmployeePayrollData(int employeeId) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(employeeId);
        repo.delete(empData);
    }

	

    
}


