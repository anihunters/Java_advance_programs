package errorchecking;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int	n=sc.nextInt();
		int prime=0;
	
		for(int i=2;i<n;i++)
		{
			if (n%i==0)
				prime=prime+1;
			
		}
		if(prime==0)
			System.out.print("prime number");
		else
			System.out.print("not prime");
	}
		
	
}


