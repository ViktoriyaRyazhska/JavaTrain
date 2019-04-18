package com.number.mounth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberofMounth {

	public static void main(String[] args) throws IOException {
		
		int days_of_mounthes[ ]= 	{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		BufferedReader call = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please, enter the number of mounth ");
		int month = Integer.parseInt(call.readLine());
		
		for (int i = 0; i < days_of_mounthes.length; i++) {
			if (i == (month - 1)) {
				
				System.out.println("The " + (i +1) + " month consist of " + days_of_mounthes[i]);;
			}
		}
	}

}
