package com.learn.hibernate.OneToMany.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	int p_ID;
	String p_Name;
	
	@ManyToMany
	List<Developer> developers;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int p_ID, String p_Name, List<Developer> developers) {
		super();
		this.p_ID = p_ID;
		this.p_Name = p_Name;
		this.developers = developers;
	}

	public int getP_ID() {
		return p_ID;
	}

	public void setP_ID(int p_ID) {
		this.p_ID = p_ID;
	}

	public String getP_Name() {
		return p_Name;
	}

	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}

	public List<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}

	@Override
	public String toString() {
		return "Project [p_ID=" + p_ID + ", p_Name=" + p_Name + ", developers=" + developers + "]";
	}
	
	
}
