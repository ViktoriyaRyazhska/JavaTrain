package practicaltask.one;
public class IstudyJava {

	
	public static void main(String[] args) throws Exception {
		/*public String s1 = "Hello, world";
		public String s2 = "Peace in the peace";*/
		Thread t1 = new MyThread(1, 100, "Hello, world");
		Thread t2 = new MyThread(2, 250, "Peace in the peace");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("My name is Oksana");

	}

}
