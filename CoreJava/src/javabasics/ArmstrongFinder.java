package javabasics;

public class ArmstrongFinder {
	
	public static void main(String[] args) {
		int sum = 0;
		int a = 153;
		int x=a;
		
		
		while(a>0) {
		int rem = 	a % 10;
		
		int b = rem*rem*rem;
		sum = sum+b;
		a = a/10;
		}
		if(sum==x) {
		System.out.println(sum+" is a Armstrong number");
	}else {
		System.out.println(sum+" is not an Armstrong number");

	}
	}

}
 
