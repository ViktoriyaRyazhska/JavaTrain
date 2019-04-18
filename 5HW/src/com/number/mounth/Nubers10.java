package com.number.mounth;

public class Nubers10 {

	public static void main(String[] args) {
		
		
		double numbers[ ]= 	{31, 5, -9, 37, 13, 8, 1, 3, 1, 3};
		double sum = 0;
		for (int i = 0; i < 5; i++) { 
			
			if (numbers[i] > 0) {sum += numbers[i];
			
			}
		
			else {
				double product = 1;
				for (int j = 5; j < 10; j++) 
				{
					product = product * numbers[j];
					}
				System.out.println("Product = " + product);

				}
					
			}System.out.println("Sum = " + sum);
	}
	
}
