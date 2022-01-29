import java.util.Scanner;
public class Bitwise_ops {

	public static void main(String[] args) {
		int a,b;
		Scanner input = new Scanner(System.in);
		
		// Bitwise Unary NOT
		System.out.println("Enter Number");
		a=input.nextInt();
		System.out.println(" Bitwise unary NOT of entered Number:"+ ~ a);
		
		// Bitwise AND operator
		System.out.println("Enter numbers to perform AND operation");
		a=input.nextInt();
		b=input.nextInt();
		System.out.println("a & b =" +(a&b));
		
		// Bitwise OR operator
		System.out.println("Enter numbers to perform OR operation");
		a=input.nextInt();
		b=input.nextInt();
		System.out.println("a | b =" +(a|b));
		
		// Bitwise XOR operator
		System.out.println("Enter numbers to perform XOR operation");
		a=input.nextInt();
		b=input.nextInt();
	    System.out.println("a & b =" +(a^b));
	    
	    //Right and Left Shift
	    System.out.println("enter number");
	    a=input.nextInt();
	    System.out.println("Right Shift:" +(a>>1));
	    System.out.println("Left Shift"+(a<<1));
	    
	    
	    
	}
	
}
