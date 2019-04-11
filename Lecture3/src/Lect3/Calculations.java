package Lect3;

public class Calculations {

	public static void main(String[] args) {
	Employee employee = new Employee("Cat", 495, 5);
	Employee employee2 = new Employee("Dog", 105, 6);
	Employee employee3 = new Employee("Pig", 150, 4);
	
	Employee.totalSum = employee.getSalary() + employee2.getSalary() + employee3.getSalary();
	System.out.println("Total Salary = " + Employee.totalSum);
	
	}

}
