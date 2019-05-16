package homework.one;

import practicaltask.one.MyThread;

public class ThreeTreads {

	public static String str = new String("abcdefghijklmnopqrstu");
	public static void main(String[] args) throws Exception {
		/*String[] substr = new String[3]; чомусь не хоче мені нормально count рахувати
		for (int i = 0; i < str.length(); i = i + 7) {
			int count = 0;
			substr[count] = str.substring(i, i + 7); 
			System.out.println(str.substring(i, i + 7) + i + "My substring");
			
			count++; System.out.println("count is " + count);
		}
		Thread t1 = new MyThread(1, 100, substr[1]);
		Thread t2 = new MyThread(2, 100, substr[2]);
		Thread t3 = new MyThread(3, 250, substr[3]);
		t1.start();
		t2.start();
		t3.start();*/

		Thread t1 = new MyThread(1, 50, "First massage");
		Thread t2 = new MyThread(2, 50, "Second massage");
		Thread t3 = new MyThread(3, 500, "Third massage");
		t1.start();
		t2.start();
		t3.start(); 
		
	}

}
