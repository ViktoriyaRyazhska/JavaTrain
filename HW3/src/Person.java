
public class Person {
	
	private String name;
	private int birthYear;
	
	public Person () {}   
	
	public Person (String Name, int BirthYear) {
		this.name = Name;
		this.birthYear = BirthYear;	
	}

//	@Override
//	public String toString() {
//		return "Person [Name=" + name + ", birthYear=" + birthYear + "]";  //what does this code?
//	}
	
    public int age() {
    	int currentYear = 2019;
    	
    	return currentYear - birthYear;
    }
    
    public String getName() { 	
    		return name;
    	}
    
    public void setName(String Name) {
    	name = Name;
    }
    public int getbirthYear() { 	
		return birthYear;
	}

public void setbirthYear(int birthYeare) {
	birthYear = birthYear;	
    
}
}
