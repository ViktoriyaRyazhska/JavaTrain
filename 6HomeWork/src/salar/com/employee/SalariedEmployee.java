package salar.com.employee;

public class SalariedEmployee extends Employee  {

		
	public SalariedEmployee (double avsalary, String name) {
		setAvsalary(avsalary);
		this.name = name;
		setEmployeeld("socialSecurityNumber");
	}
	
	public double calculatePay() {
		System.out.println("I am " + name + " salaried employee my ID is " + getEmployeeld() + " and my salary is  " + getAvsalary());
		return getAvsalary();
	}

	/*public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}*/
}
