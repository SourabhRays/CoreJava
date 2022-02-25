package javabasics;

public class PrimeFinder {

	public static void main(String[] args) {
		int number = 111;
		int rem = 0;
		for (int i = 2; i <= number; i++) {
			
			rem = number % i;
			
			if (rem != 0) {
				System.out.println(number + " is prime");
				break;
			} else {
				System.out.println(number + " is not prime");
				break;
			}
		}

	}

}
