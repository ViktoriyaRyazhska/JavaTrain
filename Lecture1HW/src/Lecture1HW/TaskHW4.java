package Lecture1HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskHW4 {

	public static void main(String[] args) throws IOException{
		System.out.println("What is the price for first call");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int call1 = Integer.parseInt(br.readLine());
		System.out.println("What is the price for second call?");
		int call2 = Integer.parseInt(br.readLine());
		System.out.println("What is the price for third call?");
		int call3 = Integer.parseInt(br.readLine());
		System.out.println("How much time the first call last?");
		int duration1 = Integer.parseInt(br.readLine());
		System.out.println("How much time the second call last?");
		int duration2 = Integer.parseInt(br.readLine());
		System.out.println("How much time the third call last?");
		int duration3 = Integer.parseInt(br.readLine());
		int price1 = call1 * duration1;
		int price2 = call2 * duration2;
		int price3 = call3 * duration3;
		System.out.println("Price per first call : " + price1);
		System.out.println("Price per second call : " + price2);
		System.out.println("Price per third call : " + price3);
		System.out.println("Summary : " + (price1 + price2 + price3));

	}

}
