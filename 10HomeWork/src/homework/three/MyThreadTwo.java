package homework.three;

public class MyThreadTwo extends Thread{
	private int number;
	private int pause;
	private String s;
	
	public MyThreadTwo (int number, int pause, String s) {
		this.number = number;
		this.pause = pause;
		this.s = s;
	}
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {sleep(pause);
			 
			} catch (InterruptedException e) {}
			
				System.out.println("Thread " + number + "Thread number two"  + s);
			
			
			
		}
	}
}
