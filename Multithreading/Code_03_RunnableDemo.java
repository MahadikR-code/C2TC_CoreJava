
class MyThread implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Demo thread running");
		}

	}
}

class Code_03_RunnableDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread Running");
		}
		MyThread mt = new MyThread();
		Thread T1 = new Thread(mt);
		T1.start();
	}
}