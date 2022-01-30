
class ThreadDemo extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(" Demo Thread Started");
		}
	}
}

public class Code_02_ThreadDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread Started");
		}
		ThreadDemo T1 = new ThreadDemo();
		T1.start();

	}

}
