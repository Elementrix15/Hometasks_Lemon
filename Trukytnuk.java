import java.util.*;
public class Trukytnuk {
	public static void main(String[] args) {
		System.out.println("Input your katetu a and b : ");
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double S = 0.5*a*b;
		double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		double P = a+b+c;
		System.out.println("S = " +S+ " .   c = " +c+ " .   P = " +P+ " .");
		
		
	}

}
