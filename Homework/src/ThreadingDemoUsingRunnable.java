
public class ThreadingDemoUsingRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("I am Rohit");
	}

	public static void main(String args[]) {
		ThreadingDemoUsingRunnable ex = new ThreadingDemoUsingRunnable();
		Thread t1 = new Thread(ex);
		t1.start();
		for (int j = 0; j < 5; j++)
			System.out.println("I am Engineer");
		
	}
}
