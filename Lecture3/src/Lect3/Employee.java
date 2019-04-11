package Lect3;

public class Employee {

	private String name;
	private int rate;
	private int hours;
	static int totalSum;
	
	public Employee (String name, int rate) {
		
		this.name = name;
		this.rate = rate;
	
	}
	public Employee () {
		
	}
	public Employee (String name, int rate, int hours) {
		
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return this.rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHours() {
		return this.hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getSalary() {
		return rate * hours;
	}
	public String toString() {
		String result = "name "+ this.name + " rate"+ this.rate + "hours"+ this.hours;
		return result;
	}
	public void changeRate(int newRate) {
		this.rate = newRate;
	}
	public double getBonuses() { 
		double money = getSalary();
		return money * 0.1;
	}
}
