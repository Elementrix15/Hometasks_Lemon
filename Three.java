import java.util.*;
public class Three {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Введите число: ");
		double n=scan.nextDouble();
		int k= (int)n+1;
		if(n-(int)n<0.5) {
			System.out.println("Число округляется до   " +(int)n);		
		}
		else 
		{
			System.out.println("Число округляется до   " +k);
		}
		
	}

}
