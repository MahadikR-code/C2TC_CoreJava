import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		float a,b,c;
		System.out.println("Enter values of a & b");
		Scanner inputs=new Scanner(System.in);
		a=inputs.nextInt();
		b=inputs.nextInt();
		
		System.out.println("Enter Which Operation to perform");
		String n=inputs.next();
		
		
		switch(n)
		{
		case "ADD":
		c=a+b;
		System.out.println("Addition of a & b ="+  c);
		break;
		
		case "SUB":
		c=a-b;
		System.out.println("substraction of a & b ="+  c);
		break;
		
		case "MUL":
		c=a*b;
		System.out.println("multiplcation"+  c);
		break;
		
		case "DIV":
		c=a/b;
		System.out.println("Division"+  c);
		break;
		
		case "MOD":
		c=a%b;
		System.out.println("Modulus"+  c);
		break;
		
		default:
			System.out.println("Invalid Operation");
			break;
		}
		
	}

}
