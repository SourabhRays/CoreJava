package javabasics;
import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		a = scan.nextInt();
		
		System.out.println("Enter next value to compare : ");
		b = scan.nextInt();
		
		if (a>b) {
			System.out.println(a+" is largest value");
		}
		else if (a<b) {
			System.out.println(b+" is largest value");
		}
		else {
			System.out.println("Both values are equale");
		}
	}

}
