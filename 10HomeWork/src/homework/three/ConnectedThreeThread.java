package homework.three;



public class ConnectedThreeThread {

	public static void main(String[] args) {
		Thread t1 = new MyThreadOne(1, 100, "Hello, world");
		Thread t2 = new MyThreadTwo(2, 250, "Peace in the peace");
		Thread t3 = new MyThreadThree(3, 250, "Peace in e");
		t1.start();
		/*t2.start();*/
		t3.start();
		
		System.out.println("My name is Oksana");

	}

}
