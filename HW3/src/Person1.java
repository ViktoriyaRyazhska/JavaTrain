import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person1 {

	public static void main(String[] args) throws IOException { 
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Hello. What is your name?");

		String Name = br.readLine();

		System.out.println("What is the year of your birth?");

		String birthYea = br.readLine();
		int yob = Integer.parseUnsignedInt(birthYea);
		
		Person human = new Person(Name, yob);
		
		System.out.println(human.getName() + " your age is: " + human.age());
		
  

	}

}

