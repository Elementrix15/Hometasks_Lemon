import java.util.Scanner;
public class Second {
	public static void main (String[] args) {
		System.out.println("Input two-digit number n : " );
		Scanner scan = new Scanner(System.in);	
		int n = scan.nextInt();
		int x = n/10 ;
		int y = n%10 ;
		int sum = x + y;
		System.out.println("Sum = "+x+ "+" +y+ "=" +sum );
		
	}
	
	
}
