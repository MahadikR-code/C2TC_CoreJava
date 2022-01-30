
public class Code_01_MainThread {

	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println("current thread: \t" + t);

//changing name of thread
		t.setName("Mian Thread");
		System.out.println("After name change \t" + t);
		t.sleep(3000);
		System.out.println("End of Thread & Program");

	}

}
