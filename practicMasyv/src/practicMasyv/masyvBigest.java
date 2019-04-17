package practicMasyv;

public class masyvBigest {

	public static void main(String[] args) {
		
		int number[] = {1, 5, 3, 0, 5, 6, 7, 8, 1};
		
		
		int max = number[0];
		int imax = 0;
		int i = 0;
		while (i < number.length) {

		if (number[i] > max) {
			max = number[i];
			imax = i;

		}

		i++;

		}

		System.out.print("Maximum = " + max);

		System.out.println(" is in " + (imax) + " place");
		
		
		
		
	}

}
