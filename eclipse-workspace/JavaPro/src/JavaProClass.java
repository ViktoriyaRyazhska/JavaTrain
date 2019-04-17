import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaProClass {

	public static void main(String[] args) throws IOException {

		
		Person pr1 = new Person("Ann", 1999);
		System.out.println(pr1);
		System.out.println(pr1.getAge());
		
		pr1.setName ("Ann changed");
		System.out.println(pr1);
		System.out.println(pr1.getAge());
		
		Person pr2 = new Person("Tom", 1995);
		System.out.println(pr2);
		System.out.println(pr2.getAge());
	
		Person pr3 = new Person("Robert", 1900);
		System.out.println(pr3);
		System.out.println(pr3.getAge());
		
		Person pr4 = new Person("John", 2000);
		System.out.println(pr4);
		System.out.println(pr4.getAge());
		
		Person pr5 = new Person("Kate", 2020);
		System.out.println(pr5);
		System.out.println(pr5.getAge());
	}
}
