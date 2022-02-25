package oop;

public class AccountTest {

	public static void main(String[] args) {

		Account a = new Account();
		
		a.setNumber("34234235");
		a.setAccountType("Current Account");
		
		String number = a.getNumber();
		String accType = a.getAccountType();
		
		System.out.println("Acc no. : "+ number +"\nAcc. Type : "+accType);
		System.out.println("Balance : "+a.getBalance());

		int d_amt = 500;
		a.deposit(d_amt);
		System.out.println("Rs."+d_amt+" Deposited | Balance : "+a.getBalance());
        
		int w_amt = 300;
		if(w_amt <= a.getBalance()) {
			a.withdrawal(w_amt);
        	System.out.println("Rs."+w_amt+" Withdrawaled | Balance : "+a.getBalance());
		}else {
			System.out.println("Insufficient Balance! can't withdrawal");
		}
		
		
	
	}

}
