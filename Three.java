import java.util.*;
public class Three {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������� �����: ");
		double n=scan.nextDouble();
		int k= (int)n+1;
		if(n-(int)n<0.5) {
			System.out.println("����� ����������� ��   " +(int)n);		
		}
		else 
		{
			System.out.println("����� ����������� ��   " +k);
		}
		
	}

}
