package errorchecking;

import java.util.Scanner;

public class Factorioal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fact=1,N,i;
		
		N=sc.nextInt();
		
		for(i=1;i<=N;i++)
			fact=fact*i;
		System.out.print("factorial of "+N+" is "+fact);

	}

}
