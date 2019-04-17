
public class Employee {

		private String name;
		private int DepNumber;
		private int Salary;
		
		private void Name () {
		}


	public Employee (String name, int DepNumber, int Salary) {
			this.setName(name);
			this.setDepNumber(DepNumber);
			this.setSalary (Salary);
	}	
			
			@Override
			public String toString() {
				return "Person [Name=" + getName() + ", DepNumber=" + getDepNumber() + ", Salary=" + getSalary() +"]";
			}


			public int getDepNumber() {
				return DepNumber;
			}


			public void setDepNumber(int depNumber) {
				DepNumber = depNumber;
			}


			public int getSalary() {
				return Salary;
			}


			public void setSalary(int salary) {
				Salary = salary;
			}


			public String getName() {
				return name;
			}


			public void setName(String name) {
				this.name = name;
			}		
		

			
			
	}

	

