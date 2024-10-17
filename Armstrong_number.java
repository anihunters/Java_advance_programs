package errorchecking;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int n,r,sum,temp;
		 
		n=sc.nextInt();
		sum=0;
		temp=n;
		
		
		while(n>0)
		{
			r=n%10;
		    n=n/10;
		    sum= sum+ (r*r*r);
		}
		    if(temp==sum)
		    
		    	System.out.println("its an armstrong number");
		    else
		    	System.out.print("not armstrong");
		    	
		
	}
		
	}

