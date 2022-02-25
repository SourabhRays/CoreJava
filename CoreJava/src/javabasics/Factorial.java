package javabasics;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double i,a=1,b;
 		System.out.println("Enter a value to find factorial for");		 
 		b=scan.nextInt();
		
		for( i=1; i<=b; i++) {
			a=a*i;
		}
		System.out.println("Answer is "+a);
	}
}
