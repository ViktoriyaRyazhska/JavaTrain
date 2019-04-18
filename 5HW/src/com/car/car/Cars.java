package com.car.car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class Cars {

	public static void main(String[] args) throws IOException {
		BufferedReader cc = new BufferedReader(new InputStreamReader(System.in));
		
		Car[] carss = new Car[4];
		carss[0] = new Car("Volvo", 700);
		carss[1] = new Car("Mercedes", 200);
		carss[2] = new Car("Opel", 1000);
		carss[3] = new Car("Zuk", 500);
		
		for (int i = 0; i < carss.length; i++) {
			System.out.println("Please, enter the year of production of your car");
			int b = Integer.parseInt(cc.readLine());
			carss[i].setYearofprod(b);
			
		}
		
		for (int i = 0; i < carss.length; i++) {
			
			System.out.println("The year of production of " + (i+1) + " car is " + carss[i].getYearofprod());		
		}
		
Car temp;
			
		for (int i = 0; i < carss.length - 1; i++) {
			for (int j = i + 1; j < carss.length; j++) {
				if (carss[i].getYearofprod() < carss[j].getYearofprod()) {
					temp = carss[i];
					carss[i] = carss[j];
					carss[j] = temp;
				}
			}
		}
		for (int i = 0; i < carss.length; i++) {
			System.out.println(carss[i].getName() + " of " + carss[i].getYearofprod() + " year of production" );
		}
		
		
	}

}
