package r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {

			public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Hello. What is your name?");

			String answer = br.readLine();

			System.out.println("Where do you live "+ answer+'?');

			String addres = br.readLine();
			
			System.out.println("Hello " + answer + " from " + addres + "!");

		
	}

}
