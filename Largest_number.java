package errorchecking;
import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		int a,b,c, largest, temp;
		
		System.out.println("Enter the first number");
		a=sc.nextInt();
		
		System.out.println("Enter the second number");
		b=sc.nextInt();
		
		System.out.println("Enter the third number");
		c=sc.nextInt();
		
		temp=a>b?a:b;
		largest=c>temp?c:temp;
		
		System.out.println("the largest number " + largest);
	}

}
