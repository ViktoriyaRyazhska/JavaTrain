package com.number.mounth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers5 {

	public static void main(String[] args) throws IOException {
		BufferedReader cc = new BufferedReader(new InputStreamReader(System.in));
		
		int numb[] = new int [5];
		int temp[] = new int [5];
		
		
		for (int i = 0; i < numb.length; i++) {
			System.out.println("Please, enter your number");
			int b = Integer.parseInt(cc.readLine());
			numb[i] = b;			
		}
		
		
		
		int product = 1;
		for (int i = 0; i < numb.length; i++) {
			if (numb[i] % 2 == 0) {product = product * numb[i];}}
		System.out.println("Product of even numbers = " + product);

		

		
		
		int min = numb[0];
		int imin = 0;
		int i = 0;
		while (i < numb.length) {
			if (numb[i] < min) {
				min = numb[i];
				imin = i;
			}
			i++;
		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");

		
			
		
			
			int first = numb[0];
			int ifirst = 0;
			int k = 0;
			 while (k < numb.length) {
				if (numb[k] > 0) {
					first = numb[k];
					ifirst = k;
					break;
				}
				k++;
			}
			System.out.print("The first positive element of array numb = " + first);
			System.out.println(" is in " + (ifirst + 1) + " place");
			
			
			int second = numb[ifirst + 1];
			int isecond = first + 1;
			int m = ifirst + 1;
			while (m < numb.length) {
				if (numb[m] > second) {
					second = numb[m];
					isecond = m;
					break;
				}
				m++;
			}
			System.out.print("The second positive element of array numb = " + second);
			System.out.println(" is in " + (isecond + 1) + " place");

		
		
			
		for (int j = 0; j < numb.length; j++) {
			System.out.println("Please, enter your number");
			int b = Integer.parseInt(cc.readLine());
			numb[j] = b;
			if (b < 0){
				/*b = j;*/ System.out.println(b + " is negative");
				break;
			}

		}

		

	}

}
