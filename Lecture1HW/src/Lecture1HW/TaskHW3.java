package Lecture1HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskHW3 {
	public static void main(String[] args) throws IOException{
		System.out.println("What is your Name?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println("Where do you live " + name + "?");
		String address = br.readLine();
		System.out.println("Your name is " + name);
		System.out.println("Your address is :" + address);
	}

}

