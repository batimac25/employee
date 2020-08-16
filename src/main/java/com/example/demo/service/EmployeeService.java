package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.EmployeeEntity;

public interface EmployeeService {
	
	public List<EmployeeEntity> getAllEmployeeDetails();
	
    public Optional<EmployeeEntity> getEmployeeById(Long empId);
    
    public void createEmployee(EmployeeEntity employeeEntity);
}
