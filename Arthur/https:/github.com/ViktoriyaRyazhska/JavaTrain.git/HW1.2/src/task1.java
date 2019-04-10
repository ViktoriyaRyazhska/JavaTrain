import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
	
		
		public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Hello. What is a radius?");

			String radius = br.readLine();
			double r = Double.parseDouble(radius);


			System.out.println("Perimeter of circle is " + (2*Math.PI*r));
			System.out.println("Area of circle is " + (Math.PI*Math.pow(r, 2)));
		

	}

}
