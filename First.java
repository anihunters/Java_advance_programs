package errorchecking;
import java.util.Scanner;

public class First {

	/* main is the entry point to the application	 */
	
	public static void main(String[] args) {
	

		for(int i=1;i<5;i++)
        {
			for(int j=1;j<=i;j++)
			{
			if(j==4) {
				System.out.println(" 5 ");
		}
			else
			System.out.print(j);
			}
			System.out.println();
        }
			
	}

}