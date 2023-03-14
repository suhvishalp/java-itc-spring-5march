package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.model.Employee;

@Service
public class EmployeeService {
	
	public EmployeeService() {
		System.out.println("EmployeeService object is created");
	}
	
	public void onBoardNewEmployee(Employee employee) {
	
		//write the logic / code to onboard a new employee
	}

	public void deActivateEmployee(Employee employee) {
		
		//write code to offboard employee
	}
	
	
}
