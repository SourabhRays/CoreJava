package javabasics;
import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter a value : ");
		a = scan.nextInt();
		
		System.out.println("Enter another value : ");
		b = scan.nextInt();
		
		if(!(a>b || a<b)) {
			System.out.println("Both values are equale");
			
		}else if(a>b || a<b && a>b) {
			System.out.println(b+" is smaller value");
			
		}else {
			System.out.println(a+" is smaller value");

		}
	}
}
