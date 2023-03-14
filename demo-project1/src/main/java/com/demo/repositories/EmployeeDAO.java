package com.demo.repositories;

import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class EmployeeDAO {

	public EmployeeDAO() {
		System.out.println("EmployeeDAO object is created");
	}
	
	public void saveEmployee(Employee employee) {
		
	}
	
	public void getEmployee(int id) {
		
	}
	
	public void deleteEmployee(int id) {
		
	}
}

