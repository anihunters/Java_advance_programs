package errorchecking;

public class Even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=100;
		
		System.out.print("even number betweet 0 to " + number);
		for(int i=1;i<number;i++) {
			if (i%2==0) {
				
				System.out.println(i+"" );
			}
		}
	}

}
