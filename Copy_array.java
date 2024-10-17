package errorchecking;
import java.util.Scanner;

public class Copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the element of array");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the first array");
		for(int i=0;i<5;i++) {
		
		System.out.print(a[i]+ " ");
		
		}
		System.out.print("\nSecond arrays element ");
		for(int i=0;i<5;i++) {
			b[i]=a[i];
			System.out.print(b[i] + "  ");
		}
	}

}
