package oop;

import java.util.Scanner;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
	Scanner scan = new Scanner(System.in);
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	
	
	public void deposit(int amount) {
		balance = balance + amount;
		
		
	}
	public void withdrawal(int amount) {
		balance = balance - amount;
		
	}
	public void fundTransfer() {
		
	}
	public void payBill() {
		
	}
}
