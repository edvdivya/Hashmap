package com.cg.hashmap.service;

import java.util.Comparator;

import com.cg.hashmap.dto.Employee;




	public class NameComparator<T,K> implements Comparator<Employee<T,K>>{
		public int compare(Employee<T, K> o1, Employee<T, K> o) {
			// TODO Auto-generated method stub
			return o1.getEmpName().compareTo(o.getEmpName());
		

	}
}
