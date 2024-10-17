package errorchecking;
import java.util.Scanner;
public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r;
		int n;
		int sum=0;
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();	
		while (n!=0) {
	
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		System.out.print("the sum of given number " + sum);
	}

}
