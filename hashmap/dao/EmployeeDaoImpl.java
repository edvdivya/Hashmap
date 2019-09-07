package com.cg.hashmap.dao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.cg.hashmap.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	HashMap<Integer, Employee<?, ?>> myMap = new HashMap<Integer, Employee<?, ?>>();

	public Employee<?, ?> addEmployee(Employee<?,?> emp) {
		// TODO Auto-generated method stub
		myMap.put((Integer) emp.getEmpId(), emp);
		return emp;
	}
	public HashMap<?,?> showEmployee() {
		// TODO Auto-generated method stub
		return myMap;
	
	}

}
