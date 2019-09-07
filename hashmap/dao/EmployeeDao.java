package com.cg.hashmap .dao;



import java.util.HashMap;
import java.util.List;

import com.cg.hashmap.dto.Employee;

public interface EmployeeDao {

	public Employee<?,?> addEmployee(Employee<?,?> emp);
	public HashMap<?,?> showEmployee();
	
}
