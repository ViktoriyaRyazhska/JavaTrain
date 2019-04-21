package person.com;

public class Teachers extends Staff {

	final String TYPE_PERSON = "Teacher";
	
	public Teachers() {
		super();
		System.out.println(TYPE_PERSON);
	}
	
	public void print() {
		System.out.println("I am a teacher");
	}
	
	public void salary() {
		System.out.println("my salary");
	}
	
	
}
