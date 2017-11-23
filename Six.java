import java.util.*;
public class Six {
	void  methodS (double mas[]) {
		double mas1[]=new double [5];
		double exp=0.1;
		for (int i=0; i<mas.length; i++) {
			mas1[i] = mas[i]+mas[i]*exp;
		}
		System.out.println("Our mas : " +Arrays.toString(mas)+ "Changed mas : " +Arrays.toString(mas1));
	}
public static void main(String [] args) {
	System.out.println("Input mas : ");
	Scanner scan= new Scanner(System.in);
	double mas[] = new double[5];
	for (int i=0; i<mas.length; i++) {
		mas[i]= scan.nextDouble();
	}
	Six m = new Six();
	m.methodS(mas);
}
}