package Lecture1HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskHW1 {

	public static void main(String[] args) throws IOException {
		
		String geta = "Specify value for a";
		System.out.println(geta);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a1 = Integer.parseInt(br.readLine());
		String getb = "Specify value for b";
		System.out.println(getb);
		int b1 = Integer.parseInt(br.readLine());
		int yyy = a1 + b1;
		int ddd = a1 * b1;
		float zzz = (float)a1 / b1;
		int kkk = a1 - b1;
		System.out.println("a + b = " + yyy);
		System.out.println("a - b = " + kkk);
		System.out.println("a / b = " + zzz);
		System.out.println("a * b = " + ddd);
	}

}
