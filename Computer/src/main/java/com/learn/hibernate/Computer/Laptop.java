package com.learn.hibernate.Computer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	int laptopId;
	String laptopBrand;
	int laptopPrice;
	
	@OneToOne
	Charger charger;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int laptopId, String laptopBrand, int laptopPrice, Charger charger) {
		super();
		this.laptopId = laptopId;
		this.laptopBrand = laptopBrand;
		this.laptopPrice = laptopPrice;
		this.charger = charger;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	public int getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(int laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopBrand=" + laptopBrand + ", laptopPrice=" + laptopPrice
				+ ", charger=" + charger + "]";
	}
	
	
}
