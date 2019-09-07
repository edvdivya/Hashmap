package com.cg.hashmap.dto;

import java.util.List;

public class project {

	Integer projId;
	String projName;
	double projCost;
	List<Employee> empList;
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public double getProjCost() {
		return projCost;
	}
	public void setProjCost(double projCost) {
		this.projCost = projCost;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
}
