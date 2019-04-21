package salar.com.employee;

public class ContractEmployee extends Employee  {

	String federalTaxIdmember;
	
	private double rate;
	private double hours;
	
	public ContractEmployee (double rate, double hours, String name ) {
		this.rate = rate;
		this.hours = hours;
		this.name = name;
		setEmployeeld("federalTaxIdmember");
	}
	
	public double calculatePay() {
		setAvsalary(rate * hours);
		System.out.println("I am " + name + " contract employeemy ID is " + getEmployeeld() + " and my salary is  " + getAvsalary());
		return getAvsalary();
		
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
}
