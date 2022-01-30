class SleepTest extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			// Thread will sleep for 500 msec
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println(i);

		}
	}
}

public class Code_04_SleepDemo {

	public static void main(String[] args) {
		SleepTest T1 = new SleepTest();
		SleepTest T2 = new SleepTest();
		T1.start();
		T2.start();
	}

}
