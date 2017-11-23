import java.util.* ;
public class Seven {
	public static void main (String[] args) {
		System.out.println("Input four numbers : ");
		Scanner scan = new Scanner(System.in);
		int i;
		int numbers []  = new int [4];
		int max = numbers [0] ;
		for (i = 0; i < numbers.length; i++) {
			 numbers [i]  = scan.nextInt();
			if(max<numbers[i])
				max = numbers [i];
		}
		System.out.println("Max = " +max);
	}
}