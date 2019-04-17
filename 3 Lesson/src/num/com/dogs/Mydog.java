package num.com.dogs;
import java.io.IOException;
public class Mydog {

	enum Breeds {
		Doberman, GermanShepherd, Akita; 

		}
	
	public static void comparenames(String x1, String x2) {
		if (x1 == x2) {
			System.out.println("There are two dogs with same names " + x1);
			/*return true;*/
		}
	}
	
	public static void nameofoldestDog(Dogs s1, Dogs s2, Dogs s3) {
		if (s1.getAge() > s2.getAge()) {
			System.out.println(" The olest dog is " + s1.getName() + " y.o., " + s1.getBreed());
		}
		else { if (s1.getAge() == s2.getAge()) {
			System.out.println(s1.getName() + " equells" + s2.getName());
	 	} else if (s2.getAge() > s3.getAge()) {
	 		
	 		System.out.println(" The olest dog is " + s2.getName() + " y.o., " + s2.getBreed());
	 	} else if (s2.getAge() == s3.getAge()) {
	 		System.out.println(s2.getName() + " equells" + s3.getName());
	 	} else { System.out.println(" The olest dog is " + s3.getName() + " y.o., " + s3.getBreed());
	}
		}
	}
	
	
		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Dogs d1 = new Dogs("Lora", 8);
		d1.setBreed("Doberman");
		
		Dogs d2 = new Dogs("Archee", 10);
		d2.setBreed("GermanShepherd");
		
		Dogs d3 = new Dogs("Lora", 2);
		d3.setBreed("Labrador");
				
		System.out.println("The oldest dog is "  + Math.max(Math.max(d1.getAge(), d2.getAge()), d3.getAge()) + " years old");
	
		comparenames(d1.getName(), d2.getName());
		comparenames(d2.getName(), d3.getName());
		comparenames(d1.getName(), d3.getName());
		nameofoldestDog( d1,  d2,  d3);
	}

}
