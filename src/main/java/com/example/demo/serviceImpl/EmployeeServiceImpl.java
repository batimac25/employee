package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<EmployeeEntity> getAllEmployeeDetails() {
		return  employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> getEmployeeById(Long empId) {
		return employeeRepository.findById(empId);
	}

	@Override
	public void createEmployee(EmployeeEntity employeeEntity) {
		employeeRepository.save(employeeEntity);
	}

}
