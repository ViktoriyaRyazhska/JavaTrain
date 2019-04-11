
public class Person {
	private String name;
	private int birthYear;
	
	public Person() {
	}


public Person (String name, int birthYear) {
		this.setName(name);
		this.setBirthYear(birthYear);
}	
		
		@Override
		public String toString() {
			return "Person [Name=" + getName() + ", birthYear=" + getBirthYear() + "]";
		}		
	
		public int getAge() {
			return 2019-getBirthYear();
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getBirthYear() {
			return birthYear;
		}


		public void setBirthYear(int birthYear) {
			this.birthYear = birthYear;
		}
		
}
