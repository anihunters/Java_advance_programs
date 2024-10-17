package errorchecking;

import java.util.Scanner;

public class Practice_course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a=1;
		int b=2;
		int c=30;
		int sum= a + b + c;
		
		System.out.print(sum);*/
		
	/*	float a=48;
		float b=98;
		float c=65;
		float cgpa= (a + b + c)/30;
		System.out.println(cgpa);*/
		
		
	/*	System.out.print("What is your name")	Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.print("Hello "+ name +" have a nice day");*/
		
		  Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the Distance in Kilometers: ");
	        float km = sc.nextFloat();
	        
	        //Kilometers to miles conversion
	        float miles = (float)(0.6213711922 * km);
	        
	        System.out.println("Distance in miles will be: "+miles);
		
				
		
	}

}
