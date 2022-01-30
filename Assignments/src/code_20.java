


public class code_20 
{
	
	public static void main(String[] args) 
	{
		//for loop
		for (int i = 1,j=1; i <=10||j<=10 ; i++,j++) 
		{
			System.out.println("i= "+i+" j= "+j);
		}
		System.out.println();
		
		//while loop
		int c=0,d=0;
		while (c<10||d<10) 
		{
			c++;
			d++;
			System.out.println("c= "+c+" d= "+d);
		}
		System.out.println();
		
		//Do while loop
		int a=0,b=0;
		do 
		{
		a++;
		b++;
		System.out.println("a= "+a+" b= "+b);
		} 
		while (a<10||b<10);
	}
}

