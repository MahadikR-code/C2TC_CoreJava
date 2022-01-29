//Program to display Fibbonaccy Series

import java.util.Scanner;
public class fibbo 
{

	public static void main(String[] args) 
	{
		int m=0, n=1,i,b;
		System.out.println("Enter Range of Fibbonacy series to print:");
		Scanner ab =new Scanner(System.in);
		int count=ab.nextInt();
		
		System.out.println(m+"\n" +n);
		
		for(i=0;i<count;i++) {
			b=m+n;
			m=n;
			n=b;
			System.out.println(b);
		}
		
	}

}
