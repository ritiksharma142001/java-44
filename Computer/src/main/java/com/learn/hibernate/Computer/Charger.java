package com.learn.hibernate.Computer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Charger {
	@Id
	int chargerId;
	String chargerBrandString;
	int chargerPrice;
	
	@OneToOne
	Laptop laptop;

	public Charger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Charger(int chargerId, String chargerBrandString, int chargerPrice, Laptop laptop) {
		super();
		this.chargerId = chargerId;
		this.chargerBrandString = chargerBrandString;
		this.chargerPrice = chargerPrice;
		this.laptop = laptop;
	}

	public int getChargerId() {
		return chargerId;
	}

	public void setChargerId(int chargerId) {
		this.chargerId = chargerId;
	}

	public String getChargerBrandString() {
		return chargerBrandString;
	}

	public void setChargerBrandString(String chargerBrandString) {
		this.chargerBrandString = chargerBrandString;
	}

	public int getChargerPrice() {
		return chargerPrice;
	}

	public void setChargerPrice(int chargerPrice) {
		this.chargerPrice = chargerPrice;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Charger [chargerId=" + chargerId + ", chargerBrandString=" + chargerBrandString + ", chargerPrice="
				+ chargerPrice + ", laptop=" + laptop + "]";
	}
	
	
	
}
