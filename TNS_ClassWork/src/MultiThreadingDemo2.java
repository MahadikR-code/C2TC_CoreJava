

import java.util.*;
class Demo implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
	System.out.println("Hello");}
	}
}
public class MultiThreadingDemo2 {

	public static void main(String[] args) {
		Demo m =new Demo();
		Thread t1= new Thread(m);
		t1.start();
		for(int i = 0;i<5;i++) {
	System.out.println("HIIIIIII");}
	
	}

}
