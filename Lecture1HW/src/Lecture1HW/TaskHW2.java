package Lecture1HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskHW2 {

	public static void main(String[] args)throws IOException {

		System.out.println("Provide the radius");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int radius = Integer.parseInt(br.readLine());
		double square = Math.PI * Math.pow(radius, 2);
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Square : " + square);
		System.out.println("Perimeter : " + perimeter);
	}

}
