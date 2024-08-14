package com.example.SpringProject3;

public class Laptop {
	int laptopId;
	String laptopBrand;
	double laptopCost;
	
	void switchOn() {
		System.out.println("laptop is switch on");
	}
	void shutDown() {
		System.out.println("shut down");
	}
	public Laptop() {
		super();
		System.out.println("0-para constructor");
		// TODO Auto-generated constructor stub
	}
	public Laptop(int laptopId, String laptopBrand, double laptopCost) {
		super();
		System.out.println("Para constructor");

		this.laptopId = laptopId;
		this.laptopBrand = laptopBrand;
		this.laptopCost = laptopCost;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		System.out.println("id setter method");
		this.laptopId = laptopId;
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		System.out.println("brand setter method");
		this.laptopBrand = laptopBrand;
	}
	public double getLaptopCost() {
		return laptopCost;
	}
	public void setLaptopCost(double laptopCost) {
		System.out.println("cost setter method");
		this.laptopCost = laptopCost;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopBrand=" + laptopBrand + ", laptopCost=" + laptopCost + "]";
	}
	
	
}
