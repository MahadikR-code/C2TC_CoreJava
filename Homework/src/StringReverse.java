import java.io.*;
import java.lang.*;
import java.util.*;
public class StringReverse {
	public static void main(String[] args) {
		System.out.println("Input the String to Reverse");
		Scanner input= new Scanner(System.in);
		String a=input.nextLine();
		StringBuffer sbr= new StringBuffer(a);
		sbr.reverse();
		System.out.println(sbr);
	}
}
