import java.util.*;
public class Gradus {
	public static void main(String[] args) {
		System.out.println("Input degrees Celsius : ");
		Scanner scan = new Scanner(System.in);
		double gradus = scan.nextDouble();
		double f = gradus*1.8+32;
		System.out.println( +gradus+ " Degrees Celsius = "+f+ " Degrees Fahrenheit");
	}
}
