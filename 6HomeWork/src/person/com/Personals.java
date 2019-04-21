package person.com;

public class Personals {

	public static void main(String[] args) {
		Person[] person = new Person[6];
		person[0] = new Student();
		person[1] = new Student();
		person[2] = new Teachers();
		person[3] = new Teachers();
		person[4] = new Cleaner();
		person[5] = new Cleaner();
		
		
		
		
		
		for (int i = 0; i < person.length; i++) {
			
			person[i].print();
			
		}
		
		for (int i = 0; i < person.length; i++) {
			
			if (person[i] instanceof Staff) {
				Staff stuff = (Staff) person[i];
				stuff.salary();
				
			}
		}	

	}

}
