package errorchecking;

public class Fiob_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1,n3,i,count=15;
		
		System.out.print(n1+" "+n2);
		
		for(i=2;i<count;++i)
		
		{
		n3=n1+n2;
		System.out.print(" "+n3);
			
		n1=n2;
		n2=n3;
			
			
		}
		
	}

}
