package com.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	private int deptId;
	private String deptName;
	
	@Autowired
	private Employee employee;

	public Department() {
		super();
		System.out.println("Department object is created");
	}

	public Department(int deptId, String deptName, Employee employee) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employee = employee;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
