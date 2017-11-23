import java.util.*;
public class Four {
	public static void main (String[] args) {
		System.out.println("Input three-digit number  : " );
		Scanner scan = new Scanner(System.in);	
		int num = scan.nextInt();
		int sum = ((num/100)+((num/10)%10)+(num%10));
		System.out.println("Summa numbers of your number = " +sum);
}
}