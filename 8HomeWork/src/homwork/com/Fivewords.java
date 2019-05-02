package homwork.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fivewords {

	public static void main(String[] args) throws IOException {


		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your sentence of five words:");
		String pip = br.readLine();
		
		String[] arr = pip.split(" ");
		
		for (String w : arr) {
			System.out.println(w);
		}
		
		int max = arr[0].length();
		int imax = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i].length() > max) {
				max = arr[i].length();
				imax = i;
			}
			i++;
		}
		System.out.println("Length of longest word in the sentence is = " + max);
		System.out.println("It is  on the place " + (imax + 1));
		System.out.print("It is " + arr[imax]);

	}

}
