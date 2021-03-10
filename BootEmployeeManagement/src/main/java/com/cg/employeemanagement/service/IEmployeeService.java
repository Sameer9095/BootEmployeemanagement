package com.cg.employeemanagement.service;

import com.cg.employeemanagement.entities.*;
import java.util.*;

public interface IEmployeeService {
	
	Employee add(String name, String department);
	
	Employee updateName(int id, String name);
	
	Employee findById(int id);
	
	void removeById(int id);
	
	List<Employee> findAll();

}
