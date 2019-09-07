package com.cg.hashmap.ui;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedList;
 import java.util.List;
//import java.util.Map;
// java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
//import java.util.TreeSet;

import com.cg.hashmap.dto.Employee;
//import com.cg.hashmap.service.EmployeeService;
import com.cg.hashmap.service.EmployeeServiceImpl;
import com.cg.hashmap.service.NameComparator;
import com.cg.hashmap.service.SalarySort;

public class MyApplication<T,K> {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int choice;
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		
		do {
			printDetail();
			System.out.println("Enter your choice");
		   choice=scan.nextInt();
		   switch(choice) {
			
		   case 1: System.out.println("Enter Id");
		Integer id=scan.nextInt();
		System.out.println("Enter Name");
		String name=scan.next();
		System.out.println("Enter Salary");
		Double salary=scan.nextDouble();
 
		Employee<Integer,Double> emp=new Employee<Integer,Double>();
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(salary);
		//service.addEmployee(emp);
		
		try {
			service.addEmployee(emp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		break;
		   case 2:
//			   List<Employee<?, ?>> myList=(List<Employee<?, ?>>) service.showEmployee();
//			   
			   HashMap<Long,Employee<?, ?>> myMap = (HashMap<Long, Employee<?, ?>>) service.showEmployee();
			   myMap.values();
			   List<Employee<?, ?>> myList= new ArrayList<Employee<?, ?>>( myMap.values());
			   Collections.sort(myList, new SalarySort());
				System.out.println("Sort by Salary");
				for (Employee<?, ?> employee : myList) {
					System.out.println("ID"+employee.getEmpId());
					System.out.println("Name"+employee.getEmpName());
					System.out.println("Salary"+employee.getEmpSalary());
				}
				Collections.sort(myList, new NameComparator());
				System.out.println("Sort by Name");
				for (Employee<?, ?> employee : myList) {
					System.out.println("ID"+employee.getEmpId());
					System.out.println("Name"+employee.getEmpName());
					System.out.println("Salary"+employee.getEmpSalary());
				}

			   //HashMap<Integer,String> hm=new HashMap<Integer,String>();
			   //for(Employee<Integer,Double> employee : myList) {
				   
				  // hm.put(employee.getEmpId(),employee.getEmpName());
				   
			  // }
			   
			   //Set<Entry<Integer, String>> set=hm.entrySet();
			  //Iterator i=set.iterator();	
			  //Iterator<Entry<Integer, String>> i=set.iterator();
			  
			  //while(i.hasNext()) {
				  
				  //Map.Entry<Integer, String> me=(Map.Entry<Integer,String>)i.next();
				 // System.out.println(me.getKey()+": "+me.getValue());
			  //}
			  
			  
			  
			  
			   
		   break;
		   case 3:System.exit(0);
		   
		   }
		}while(choice!=3);
		
	}

	private static void printDetail() {
		// TODO Auto-generated method stub
		System.out.println("1. to add");
		System.out.println("2. to print");
		System.out.println("3. to Exit");
	}	
	
}
