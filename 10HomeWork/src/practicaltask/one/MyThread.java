package practicaltask.one;

public class MyThread extends Thread {

	private int number;
	private int pause;
	private String s;
	
	public MyThread (int number, int pause, String s) {
		this.number = number;
		this.pause = pause;
		this.s = s;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {sleep(pause);
			 
			} catch (InterruptedException e) {}
			
				System.out.println("Thread " + number + s );
			
			
			/*System.out.printf("%s");*/
		}
	}
}
