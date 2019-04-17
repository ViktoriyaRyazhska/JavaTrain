package num.com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
	
	public static void checkrange(double a) {
		if (a >= -5 && a <= 5) {
			System.out.println(a + " is a right number");
			/*return true;*/
		}
		else {
			System.out.println(a + " is a wrong number");
	 	}
		
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader nnn = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
		int f = Integer.parseInt(nnn.readLine());
		System.out.println("Enter second number");
		int s = Integer.parseInt(nnn.readLine());
		System.out.println("Enter third number");
		int p = Integer.parseInt(nnn.readLine());

		System.out.println("max number is " + Math.max(Math.max(f, s), p));
		System.out.println("min number is " + Math.min(Math.min(f, s), p));

for (int i = 0; i < 3; i++ ) {
		System.out.println("Enter your number");	
		double b = Integer.parseInt(nnn.readLine());
		
		checkrange(b);
}
	}



}

