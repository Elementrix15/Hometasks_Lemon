import java.util.*;
public class Money {
void methodMoney (double uah) {
	double kurs =26.6;
	double dollar =uah/kurs;
	System.out.println(uah+ " uah = " +dollar+ " dollar");
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Input uah :  ");
	double uah =scan.nextDouble();
	Money m =new Money();
	m.methodMoney(uah);
}
}
