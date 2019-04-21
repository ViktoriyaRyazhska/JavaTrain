package person.com;

public class Cleaner extends Staff {

	final String TYPE_PERSON = "Cleaner";
	
	public Cleaner() {
		super();
		System.out.println(TYPE_PERSON);
	}
	
	public void print() {
		System.out.println("I am a cleaner");
	}
	
	public void salary() {
		System.out.println("my salary");
	}
	
}
