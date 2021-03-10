package com.cg.employeemanagement.ui;

import com.cg.employeemanagement.entities.*;
import com.cg.employeemanagement.service.*;
import com.cg.employeemanagement.exceptions.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUI {
	
	@Autowired
	private IEmployeeService service;
	
	public void start() {
		
		try {
			Employee Sameer = service.add("Sameer", "Developer");
			Employee Surya = service.add("Surya", "Tester");
			Employee Sam = service.add("Sam", "Senior Manager");
			
			//display(Sameer);
			//display(Surya);
			//display(Sam);
			
//			Employee fetchEmployee = service.findById(1);
//			display(fetchEmployee);
			
			//service.removeById(2);
			List<Employee>list = service.findAll();
			displayAll(list);
			
		}catch(InvalidIdException e) {
			System.out.println(e.getMessage());
		}catch(InvalidEmployeeNameException e) {
			System.out.println(e.getMessage());
		}catch(InvalidDepartmentException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
		
	}
	
	public void display(Employee employee) {
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDepartment());
	}
	
	public void displayAll(Collection<Employee>employees) {
		for(Employee employee : employees) {
			display(employee);
		}
	}

}
