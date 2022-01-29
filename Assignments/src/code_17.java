class code_17
{
	public static void main(String[] args) 
	{
		int n=8;
		boolean isPrime=true;
		for (int i = 2; i < n/2; i++) 
		{
		if(n%i==0)
			{
			     isPrime=false;
			}
		if (isPrime==true) 
			{
			System.out.println("The Number is prime number");
			}else {
				System.out.println("Number is not prime");
			}
		}
	}
}