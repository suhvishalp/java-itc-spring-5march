package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
	
		Employee emp = context.getBean(Employee.class);
		
		emp.setEmpId(101);
		emp.setEmpName("Mohammed");
		emp.setCity("Muscat");
		emp.setSalary(1000000);
		
		
		System.out.println("Employee name : "+ emp.getEmpName());
		System.out.println("City : " + emp.getCity());
	}

}
