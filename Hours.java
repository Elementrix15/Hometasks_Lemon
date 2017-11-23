import java.util.* ;
public class Hours {
	public static void main(String [] args) {
	System.out.println("Input number of days : ");
	Scanner scan = new Scanner(System.in);
	int days = scan.nextInt();
	int hours = days*24;
	int minutes = hours*60;
	int seconds = minutes*60;
	System.out.println( hours+ " Hours.    "+minutes+ "  Minuts.    "  +seconds
			+" Seconds.   " );

}
}