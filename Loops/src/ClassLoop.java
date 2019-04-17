import java.io.IOException;

public class ClassLoop {
	public static void main(String[] args) throws IOException {

		Employee[] em = new Employee[5];
		em[0] = new Employee("Ira", 3, 5000);
		em[1] = new Employee("Ann", 1, 1000);
		em[2] = new Employee("Tom", 2, 3000);
		em[3] = new Employee("Robert", 1, 2000);
		em[4] = new Employee("Julia", 2, 6000);
		
		for (int i = 0; i < em.length; i++) {
			if( em[i].getDepNumber() == 2) {
				System.out.println(em[i]);
			}
		}

		System.out.println();
		Employee tmp;
		for (int S = 0; S < em.length - 1; S++) {
			for (int j = S + 1; j < em.length; j++) {
				if (em[S].getSalary() < em[j].getSalary()) {
					tmp = em[S];
					em[S] = em[j];
					em[j] = tmp;
				}
			}
		}
		for (int i = 0; i < em.length; i++) {
			System.out.println(em[i]);

			// int[] arr = { 2, -5, 7, -4, 8, 10, -3, 1, 6, -9 };
			// int max = arr[0];
			// int imax = 0;
			// int i = 0;
			// while (i < arr.length) {
			// if (arr[i] > max) {
			// max = arr[i];
			// imax = i;
			// }
			// i++;
			// }
			// System.out.print("Maximum = " + max);
			//
			// int sum = 0;
			// for (int i1 = 0; i1 < arr.length; i1++) {
			// if (arr[i1] > 0) {
			// sum += arr[i1];
			// }
			// }
			//
			// System.out.println(" Sum = " + sum);
			//
			// int amount = 0;
			// // for (int i2 : arr) {
			// for (int i2 = 0; i2 < arr.length; i2++) {
			// if (arr[i2] < 0) {
			// amount++;
			// }
			// }
			// System.out.println("Amount = " + amount);

		}
	}
}
