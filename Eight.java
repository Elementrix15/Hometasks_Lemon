import java.util.*;
public class Eight {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Введите ваше число : ");
	int n = scan.nextInt();
	if (n%2 == 0) {
		System.out.println("Число четное.");
	}
	else {
		System.out.println("Число не четное.");
	}
}
}
