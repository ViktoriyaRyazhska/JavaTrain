
public class Employee {
	private String Name;
	private int Rate;
	private int Hours;

	public Employee() {
	}


public Employee(String Name, int Rate, int Hours) {
		this.Name = Name;
		this.Rate = Rate;
		this.Hours = Hours;
}



	@Override
	public String toString() {
		return "Employee [Name=" + getName() + ", Rate=" + Rate + ", Hours=" + Hours + "]";
	}

	public int getSalary() {
		return Hours * Rate;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
	em = new Employee();
	em.Name = "tyu";

}
