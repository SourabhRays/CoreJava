package javabasics;

public class RandomInteger {
	public static void main(String[] args) {

		int min=1,max=100;
		for(int i=0; i<=4; i++) {
			int a = (int) (Math.random()*(max-min+1)+min);
		System.out.println(a);
		}
	}
}
