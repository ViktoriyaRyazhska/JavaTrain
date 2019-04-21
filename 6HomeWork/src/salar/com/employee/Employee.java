package salar.com.employee;

abstract public class Employee implements Payment {
	String name;
	private double avsalary;
	String employeeld;
	
	public double getAvsalary() {
		return avsalary;
	}

	public void setAvsalary(double avsalary) {
		this.avsalary = avsalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}
	
}
