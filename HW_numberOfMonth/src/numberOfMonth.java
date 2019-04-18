import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numberOfMonth {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of month");
		String number = br.readLine();
		int number1 = Integer.parseUnsignedInt(number);
		
		System.out.println(showDaysCount(number1));
		
		System.out.println(showDaysCount(2+5));
		
		
		
		
	}

	public static int showDaysCount (int n) 
	{
		int month [] = {31, 28, 31, 30, 31, 30, 31, 31, 30,
				31, 30, 31};

		return month [n - 1];
	}
	
	
}
