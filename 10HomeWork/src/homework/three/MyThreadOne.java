package homework.three;

public class MyThreadOne extends Thread {
	private int number;
	private int pause;
	private String s;
	
	public MyThreadOne (int number, int pause, String s)  {
		this.number = number;
		this.pause = pause;
		this.s = s;
	}
	@Override
	public void run() {
		synchronized(MyThreadTwo.class) {
			Thread.yield();
		for (int i = 0; i < 5; i++) {
			try {sleep(pause);
			 
			} catch (InterruptedException e) {}
			
				System.out.println("Thread " + number + s );
			
			
			
		}
		}
	}
}
