package com.bridgelabz.employeepayrollapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.IEmployeeInterface;


@RestController
@RequestMapping("/employee")
public class EmployeePayrollController {
	
	@Autowired
	IEmployeeInterface iEmployeeInterface;

	
	@RequestMapping(value= {"","/","get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
	    List<EmployeePayrollData> empDataList =iEmployeeInterface.getEmployeePayrollData();
	    ResponseDTO responseDTO = new ResponseDTO("Get Call Success",empDataList);
	    return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{employeeId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollDataById(@PathVariable("employeeId") int employeeId){
	    EmployeePayrollData payrollData=iEmployeeInterface.getEmployeePayrollDataById(employeeId);
	    ResponseDTO responseDTO = new ResponseDTO("Get Call Success for id:", payrollData);
	    return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	@PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployee(@RequestBody EmployeePayrollDTO employeeDTO){
		EmployeePayrollData newEmployee = iEmployeeInterface.addEmployee(employeeDTO);
        //iEmployeeInterface.addEmployee(newEmployee);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", newEmployee);
        return new ResponseEntity<>(responseDTO,HttpStatus.CREATED);
    }
	
	@GetMapping("/show")
    public ResponseEntity<ResponseDTO> searchAll(){
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", iEmployeeInterface.getEmployeePayrollData());
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
	@PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDTO> editById(@PathVariable int id,@RequestBody EmployeePayrollDTO employeeDTO){
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", iEmployeeInterface.editById(id,employeeDTO));
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
	
	

}
