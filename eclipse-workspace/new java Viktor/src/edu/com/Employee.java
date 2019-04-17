package edu.com;

public class Employee {
	private String name;
	private float rate;
	private float hour;
	private static float Sum;
	
	public Employee(String name, float rate, float hour, float Sum) {
		this.name = name;
		this.rate = rate;
		this.hour = hour;
		this.Sum = Sum;
	}

	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public float getRate() {
		return rate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hour=" + hour + "]";
	}
	
	public float getSalary() {
		return hour*rate;
	}
	
	
}
