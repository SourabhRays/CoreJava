package javabasics;

public class ReverseDigit {
	
	public static void main(String[] args) {
		int reverse = 0;
		int number = 1234;
		
		while (number > 0) {
			int lastDigit = number % 10;
			
			reverse = (reverse * 10) + lastDigit;
			number = number/10;
		}
		System.out.println(reverse);
	}

	
	
}
