import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите два числа q  и w: ");
 int q = scan.nextInt();
 int w = scan.nextInt();
		int x = q/w ;
		int y = q%w ;
		System.out.println(q+ "/" +w+ " = " +x+ " и " +y+ " остаток");
	}

}
