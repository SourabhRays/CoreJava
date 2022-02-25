package javabasics;

// find sum of integers greater than 100 and less than 200 that are divisible by 7

public class SumOfIntegers {

	public static void main(String[] args) {

		int a = 0;

		for (int i = 100; i <= 200; i++) {

			if (i % 7 == 0) {

				a = a + i;

				System.out.println(i);

			}

		}
		System.out.println(a);

	}
}
