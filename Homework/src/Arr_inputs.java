import java.util.Scanner;
public class Arr_inputs 
{

	public static void main(String[] args) 
	{
		int m,n,i,j;
		Scanner Array= new Scanner(System.in);
		
		System.out.println("Enter no. of rows");
		m= Array.nextInt();
		
		System.out.println("Enter no. of columns");
		n= Array.nextInt();
		
		int arr[][]=new int[m][n];
		System.out.println("enter the elements of array");
		
		for(i=0; i<m; i++) 
		
			for(j=0;j<n;j++) 
		
				arr[i][j]=Array.nextInt(); 
		    
		System.out.println("Elements of array are:");
		
		for(i=0;i<m;i++) 
		{
			for(j=0;j<n;j++) 
			{
				System.out.print(arr[i][j]+"");
      			System.out.println();
			}
		}
		
	}

}
