package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	
	  @Autowired
	  EmployeeService employeeService;
	
	  @GetMapping("/allEmployees")
	  public List<EmployeeEntity> getAllEmployeeDetails(){
		  
		  return employeeService.getAllEmployeeDetails();
	  }
	  
	  @GetMapping("/getEmployee")
	  public Optional<EmployeeEntity> getEmployee(@RequestParam("id") Long empId) {
		  
		  return employeeService.getEmployeeById(empId);
	  }
	  
	  @GetMapping("/welcome")
	  public String getWelcomeMessage() {
		  return "Welcome to Batimac Consolidations";
	  }
	  
	  @PostMapping("/createEmployee")
	  public void createEmployee(@RequestBody EmployeeEntity employeeEntity) {
		   employeeService.createEmployee(employeeEntity);
	  }
}
