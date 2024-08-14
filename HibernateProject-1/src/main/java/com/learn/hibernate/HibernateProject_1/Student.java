package com.learn.hibernate.HibernateProject_1;

import javax.persistence.Entity;
import javax.persistence.Id;

//POJO - plain old java object

@Entity
public class Student {
	@Id
	int roll;
	String nameString;
	int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String nameString, int marks) {
		super();
		this.roll = roll;
		this.nameString = nameString;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", nameString=" + nameString + ", marks=" + marks + "]";
	}
	
}
