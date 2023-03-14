package com.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int empId;
	private String empName;
	private String city;
	private double salary;
	
	public Employee() {
		super();
		System.out.println("Employee object is created");
	}

	public Employee(int empId, String empName, String city, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
