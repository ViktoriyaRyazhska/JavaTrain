package practicMasyv;

public class sumPositiveNegative {

	public static void main(String[] args) {

		int numbers[] = { 4, 6, 9, -1, -7, 6, 3, 9, -4 };

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		int sump = 0;
		int sumn = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > 0) {
				sump = sump + numbers[i];
			} else {
				sumn = sumn + numbers[i];
			}
		}

		System.out.println("Sum of positive = " + sump);
		System.out.println("Sum of negative = " + sumn);

	}

}
// сортування
//int test;
//for (int i = 0; i < numbers.length; i++) {
//
//	for (int j = i + 1; j < numbers.length; j++) {
//
//		if (numbers[i] < numbers[j]) {
//			test = numbers[i];
//			numbers[i] = numbers[j];
//
//			numbers[j] = test;
//
//		}
//
//	}
//}
//
//for (int i = 0; i < numbers.length; i++) {
//
//	System.out.println(numbers[i]);
//}
//}
//
//}