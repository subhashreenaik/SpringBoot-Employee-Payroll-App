package com.bridgelabz.employeepayrollapp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@Repository
public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

}
