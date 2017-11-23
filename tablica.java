import java.util.*;
public class tablica {
	public static void main(String[] args) {
		System.out.println("Input your number : ");
		Scanner scan = new Scanner(System.in);
		int number  = scan.nextInt();
		int i;
		int res = 0;
		for  (i=1; i<10; i++) {
			res = number*i;
			System.out.println(number+ "*" +i+ "=" +res);
		}
			
		
	}

}
