package person.com;

public class Student extends Person {

	final String TYPE_PERSON = "Student";
	
	public Student() {
		System.out.println(TYPE_PERSON);
	}
	
	public void print() {
		System.out.println("I am a student");
		
	}
}
