import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minMax {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number?");
		String number = br.readLine();
		int number1 = Integer.parseUnsignedInt(number);
		
		System.out.println("Enter number?");
		number = br.readLine();
		int number2 = Integer.parseUnsignedInt(number);
		
		System.out.println("Enter number?");
		number = br.readLine();
		int number3 = Integer.parseUnsignedInt(number);
		
		
		System.out.println("Your min number is "+min(number1,number2,number3));
		System.out.println("Your max number is "+max(number1,number2,number3));
			
	}

	public static int min (int number1, int number2, int number3){
		int minNumber;
		if (number1 > number2) {
			minNumber = number2;
		} else {
			minNumber = number1;
		}
		if (minNumber>number3) {
			minNumber =  number3;
		} 
			
		
		return minNumber;
	}
	
	public static int max (int number1, int number2, int number3){
		int maxNumber;
		if (number1 < number2) {
			maxNumber = number2;
		} else {
			maxNumber = number1;
		}
		if (maxNumber < number3) {
			maxNumber =  number3;
		} 
			
		
		return maxNumber;
	}
}
