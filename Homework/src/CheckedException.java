import java.util.Scanner;

class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}

public class CheckedException
{
	 int attend;
	
	public static void validate(int attend)throws MyException
	{
	if(attend<75) 
	
		throw new MyException("You are Not elligible for Exam");
	
	else if(attend>100)
	
		throw new MyException("Invalid Input!!!! Please enter percentage properly");
	
	else 
		System.out.println("You are elligible for Exam");
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Overall Attendance");
		int a=sc.nextInt();
		try 
		{
			validate(a);
		}
		catch(MyException ex)
		{
			System.out.println("Exception Occured      "+ex);
		    ex.printStackTrace();
		}
		
	}
}