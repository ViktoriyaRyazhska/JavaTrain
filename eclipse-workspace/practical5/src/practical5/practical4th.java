//Create an array of ten integers. Display +
//the biggest of these numbers;
//the sum of positive numbers in the array;
//the amount of negative numbers in the array.
//       What values there are more: negative or positive?
//Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//all employees of a certain department (enter department number in the console);
//arrange workers by the field salary in descending order.




package practical5;



//public class practical4th {
	public class practical4th {
	    public static void main(String[] args) {
	        int[] anArray;	        // declare an array of integers

	        anArray = new int[10];	// create an array of integers

	        // assign a value to each array element and print 
	        for (int i = 0; i < anArray.length; i++) {
	            anArray[i] = i;
	            System.out.print(anArray[i] + " ");
	        }
	        System.out.println();
	        int sum = 0;
	        int[] arr = null;
			for (int i = 0; i < arr.length; i++) { sum += arr[i];}
	        System.out.println("Sum = " + sum);

	    }
	}
