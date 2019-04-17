import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class numbers {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number?");
		String number = br.readLine();
		double number1 = Double.parseDouble(number);
		
		System.out.println("Enter number?");
		number = br.readLine();
		double number2 = Double.parseDouble(number);
		
		System.out.println("Enter number?");
		number = br.readLine();
		double number3 = Double.parseDouble(number);
		
		boolean numberBool = isNumberInRange(number1);
		
		System.out.println(numberBool);
		System.out.println(isNumberInRange(number2));
		System.out.println(isNumberInRange(number3));
		
	}
	
		public static boolean isNumberInRange (double number) {
			
			return (number > -5) && (number < 5);
	}

		
		
}
