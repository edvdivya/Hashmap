package com.cg.hashmap.service;

import java.util.Comparator;

import com.cg.hashmap.dto.Employee;





	public class SalarySort<T,K> implements Comparator<Employee<T,K>>{
		public int compare(Employee<T, K> o1, Employee<T, K> o) {
			// TODO Auto-generated method stub
			if((Double)o1.getEmpSalary()>(Double)o.getEmpSalary()) {
				return 1;
			}else if((Double)o1.getEmpSalary()<(Double)o.getEmpSalary()) {
				return -1;
			}
			return 0;
}}

