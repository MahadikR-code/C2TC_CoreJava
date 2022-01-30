import java.util.Scanner;
public class CircleArea {
	
	public static void Area(double area, int radius) 
	{
		area = (radius*radius)*3.14; 
		System.out.println(area);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int radius = sc.nextInt();
		double area=0;
		Area(area, radius);
	}

}
