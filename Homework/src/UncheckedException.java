import java.util.*;
class TooYoungException extends RuntimeException 
{
 	TooYoungException(String s)
 	{
 		super(s);
 	}
}

class TooOldException extends RuntimeException 
{
 	TooOldException(String s)
 	{
 		super(s);
 	}
}
public class UncheckedException 
{
	public static void main(String args[]) 
	{
		System.out.println("Please Enter Your age");
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age<18) {
			throw new TooYoungException("You are Not elligible for Marriage");
		}
		else if(age>50)
		{
			throw new TooOldException("Your age id already crossed");
		}
		else
		{
			System.out.println("You will get best match soon......... :)");
		}
	}
}
