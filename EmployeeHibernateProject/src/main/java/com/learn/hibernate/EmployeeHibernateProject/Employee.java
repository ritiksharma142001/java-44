package com.learn.hibernate.EmployeeHibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	int empId;
	String empEmailIdString;
	double empSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empEmailIdString, double empSalary) {
		super();
		this.empId = empId;
		this.empEmailIdString = empEmailIdString;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpEmailIdString() {
		return empEmailIdString;
	}
	public void setEmpEmailIdString(String empEmailIdString) {
		this.empEmailIdString = empEmailIdString;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empEmailIdString=" + empEmailIdString + ", empSalary=" + empSalary + "]";
	}
	
}
