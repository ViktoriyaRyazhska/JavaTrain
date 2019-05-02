package homwork.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class MyName {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your surname, name and patronic:");
		String pip = br.readLine();
		
		String[] arr = pip.split(" ");
		
		for (String w : arr) {
			System.out.println(w);
		}
		System.out.println("surnames and initials is " + arr[0] + arr[1].substring(0, 1) + "." + arr[2].substring(0,  1) + ".");
		System.out.println("My na me is  " + arr[1]);
		System.out.println("My name patronic and surnames is " + arr[1] + " "+ arr[2]  + " " +  arr[0]);
	}

}
