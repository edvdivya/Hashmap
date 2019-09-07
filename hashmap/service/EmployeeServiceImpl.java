package com.cg.hashmap.service;

import java.util.HashMap;
import java.util.List;


import com.cg.hashmap.dao.EmployeeDao;
import com.cg.hashmap.dao.EmployeeDaoImpl;
import com.cg.hashmap.dto.Employee;
import com.cg.hashmap.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao dao=new EmployeeDaoImpl();

	public Employee<?, ?> addEmployee(Employee<?, ?> emp) throws EmployeeException{
		
		if ((Double)emp.getEmpSalary() <=10000.0)
		{
			throw new EmployeeException("Salary cannot be less than 10,000");
		}
		return dao.addEmployee(emp);
	}

	public HashMap<?,?> showEmployee() {
		// TODO Auto-generated method stub
		return dao.showEmployee();
	}

}
