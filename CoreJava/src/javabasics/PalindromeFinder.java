package javabasics;

public class PalindromeFinder {

	public static void main(String[] args) {
		
		int num = 1234321;
		int x = num;
		int reverse = 0;
		
		while(num > 0) {
			int a = num % 10;
			reverse = (reverse * 10) + a;
			num = num/10;
		}
		if (reverse == x) {
		System.out.println(x+" is a Palindrome number");
		}
		else {
			System.out.println(x+" is not a Palindrome number");

		}
	}
}
