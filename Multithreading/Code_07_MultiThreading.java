class NewThread extends Thread {
	Thread T1;
	String n;

	public NewThread(String name) {
		n = name;
		T1 = new Thread(this, name);
		System.out.println("Good: " + T1);
		T1.start();

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello: " + n);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
			System.out.println("exixsting Thread " + n);
		}
	}
}

public class Code_07_MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		new NewThread("Thread 1");
		new NewThread("Thread 2");
		new NewThread("Thread 3");
		new NewThread("Thread 4");
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread: " + i);
			Thread.sleep(1000);
		}
		System.out.println("Main Thread Exit");
	}

}
