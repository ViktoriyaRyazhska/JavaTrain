import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {

		public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("How long your call will take in min?");

			String MinutesString = br.readLine();
			double Minutes = Double.parseDouble(MinutesString);
			
//			System.out.println("What Country?");
			
			int price1 = 1;
			//for call to US per min
			int price2 = 2;
			//for call to UE per min
			int price3 = 3;
			//For call to FR per min
			
////			int Minutes1 = 1;
////			int Minutes2 = 2;
////			int Minutes3 = 3;
//			
////			double cost1 = price1 * Minutes1;			
////			double cost2 = price2 * Minutes2;
////			double cost3 = price3 * Minutes3;
			
//			//String CountryString = br.readLine();
//			//double Country = Double.parseDouble(CountryString);
	
			System.out.println("Your call to US will cost " + (price1*Minutes) + "$" );
			System.out.println("Your call to UE will cost " + (price2*Minutes) + "$" );
			System.out.println("Your call to FR will cost " + (price3*Minutes) + "$" );
			
			System.out.println("If you want to call to all three countries in duration of " + (Minutes)+" min. " + "it will cost you " + (price1*Minutes+price2*Minutes+price3*Minutes) + "$" );
			
//			System.out.println("Your call will cost " + (2*Minutes) + "$" + " to country 2 ");
//	        System.out.println("Your call will cost " + (1*Minutes) + "$" + " to country 3 ");
		
		
	}

}
