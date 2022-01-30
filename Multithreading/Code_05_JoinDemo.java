
class Test extends Thread {

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

public class Code_05_JoinDemo {

	public static void main(String[] args) {
		Test T1 = new Test();
		Test T2 = new Test();
		Test T3 = new Test();
		T1.start();
		try {
			T1.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		T2.start();
		T3.start();
	}

}
