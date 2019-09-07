package com.cg.hashmap.service;

import java.util.HashMap;

import com.cg.hashmap.dto.Employee;
import com.cg.hashmap.exception.EmployeeException;


public interface EmployeeService {
	public Employee<?,?> addEmployee(Employee<?,?> emp) throws EmployeeException ;
	public HashMap<?,?> showEmployee();
	
}

