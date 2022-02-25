package javabasics;

public class FindAverage {

	public static void main(String[] args) {
		int evenSum = 0,oddSum  = 0;
		int eCount = 0,oCount = 0;

	
		for(int i=1; i<=10; i++) {
			
			int rem = i % 2;
			if(rem == 0) {
				evenSum = evenSum + i;
				eCount++;
			}else {
				oddSum = oddSum + i;
				oCount++;
			}
		}
		
		int evenAverage = evenSum/eCount;
		int oddAverage  = oddSum/oCount;
		
		System.out.println("evenAverage : "+evenAverage);
		System.out.println("oddAverage : "+oddAverage);

	}

}
