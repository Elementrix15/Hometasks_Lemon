import java.util.*;
public class Fibonachi {
	
	static int fib (int n) {
	if (n==0) {
		return 0;
	}
	if (n==1) {
		return 1;
	}
	else {
		return (fib(n-1)+fib(n-2));
	}
	}
	public static void main(String[] args) {
		System.out.println("Input number n : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Fibonacci numbers : ");
		for(int nums=0;nums<n; ++nums) {
			  int result = fib(nums);
			
			  System.out.print( result+ " "  );
			  }
	}}

