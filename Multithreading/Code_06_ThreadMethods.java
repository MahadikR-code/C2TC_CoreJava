class DisplayMessage implements Runnable {
	private String message;

	public DisplayMessage(String message) {
		this.message = message;
	}

	public void run() {
		while (true) {
			System.out.println("Pop up Message");
		}
	}
}

class GuessNumber extends Thread {
	private int number;

	public GuessNumber(int number) {
		this.number = number;
	}

	public void run() {
		int counter = 0;
		int guess = 0;
		do {
			guess = (int) Math.random() * 100 + 1;
			System.out.println(this.getName()); // getName() method returns name of thread
			counter++;
		} while (guess != number);
		System.out.println("** Correct!" + this.getName() + "in" + counter + "guesses.**");
	}
}

public class Code_06_ThreadMethods {

	public static void main(String[] args) {
		Runnable hello = new DisplayMessage("Hello");
		Thread T1 = new Thread(hello);
		T1.setDaemon(true); // setDaemon method tests whether thread is daemon thread.
		T1.setName("Hello"); // setName() method is used to change the name of Thread
		System.out.println("Starting Hello Thread");
		T1.start();

		Runnable Bye = new DisplayMessage("GoodBye");
		Thread T2 = new Thread(Bye);
		T2.setDaemon(true);
		T2.setPriority(Thread.MIN_PRIORITY); // setPriority changes priority of Thread
		System.out.println("Starting GoodBye Thread");
		T2.start();

		System.out.println("Starting Thread 3");
		Thread T3 = new Thread();
		T2.start();
		try {
			T3.join(); // Join method waits for a thread to die
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Thread Interrupted");
		}
		System.out.println("Starting Thread 4");
		Thread T4 = new GuessNumber(75);
		T4.start();
		System.out.println("Main Thread is ending");
	}

}
