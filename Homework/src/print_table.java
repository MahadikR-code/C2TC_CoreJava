import java.util.*;
public class print_table {
public static void main(String[] args) {
	int a,b,i;
	System.out.println("Enter the No.to display Its Table");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	for(i=1;i<=10;i++) {
		b=a*i;
		System.out.println(b);
	}
}
}
