class Thread1 extends Thread
{
	public void run() 
	{
		for (int i = 0; i < 5; i++) 
		{
			try 
			{
				sleep(1000);
				System.out.println(Thread.currentThread().getName());
			} 
			catch (Exception e) 
			{
				
			}
		}	
	}	
}

public class ThreadMethodsDemo
{
	public static void main(String args[]) 
	{
		Thread1 T1 = new Thread1();
		Thread T2 = new Thread1();
		Thread T3 =new Thread1();
		T1.start();
//   	System.out.println("thread1 is started");
//		T1.stop();
//		System.out.println("T1 is stopped");
		T2.start();
//		System.out.println("Thread2 is started");
//		T2.stop();
//		System.out.println("T2 is stopped");
		T3.start();
//		System.out.println("thread T3 is started");
		T3.start();
		T3.stop();
	    
	}
		
}

