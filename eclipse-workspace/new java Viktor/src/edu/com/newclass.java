package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class newclass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		System.out.println("Hello. Set data for Name");
//		String name = br.readLine();
//		System.out.println("Set data for Rate");
//		float rate = Integer.parseInt(br.readLine());
//		System.out.println("Set data for hours");
//		float Hours = Integer.parseInt(br.readLine());
//		
		Employee em1 = new Employee("Vasya", 12, 13, 12);
		System.out.println(em1);
		System.out.println(em1.getSalary());

	

	}
}
