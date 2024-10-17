package errorchecking;
import java.util.*;

public class Diya_palindrome {

	public static void main(String[] args) {

	 int r,sum=0,du;
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 du=n;
	 
	 while(n>0) {
		 r= n%10;
		 sum=(sum*10)+r;
		 n=n/10;
	 }
		
	if(du==sum)
		System.out.println(du+""+" is a palindrome.");
	else
		System.out.println(du+""+" is a not palindrome.");
				
	 
	}

}
