package com.car.car;

public class Car {

	
	private String name;
	private int enginecapacity;
	private int yearofprod;
	

	
	public Car(String name, int enginecapacity) {
		this.name = name;
		this.enginecapacity = enginecapacity;
	}
	
	public Car(String name, int yearofprod, int enginecapacity) {
		this.name = name;
		this.enginecapacity = enginecapacity;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getEnginecapacity() {
		return enginecapacity;
	}



	public void setEnginecapacity(int enginecapacity) {
		this.enginecapacity = enginecapacity;
	}



	public int getYearofprod() {
		return yearofprod;
	}



	public void setYearofprod(int yearofprod) {
		this.yearofprod = yearofprod;
	}


	
	
}
