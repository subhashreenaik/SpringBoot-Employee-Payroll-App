package com.bridgelabz.employeepayrollapp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@Repository
public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

	@Query(value = "select * from employee_payroll_data, department where id = depart_id and department= :department ", nativeQuery = true)
    List<EmployeePayrollData> findEmployeesByDepartment(String department);

}
