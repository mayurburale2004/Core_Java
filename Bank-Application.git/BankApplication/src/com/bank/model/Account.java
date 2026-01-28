package com.bank.model;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	public Account(int accountNumber,String accountHolderName,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance ;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	 public double getBalance() {
	        return balance;
	    }
	 public void deposit (double amount) throws IllegalArgumentException {
		 if(amount<=0) {
			 throw new IllegalArgumentException ("Deposite amount must be positive");
		 }
		 balance+=amount;
		 
	 }
	 public void withdraw(double amount) throws IllegalArgumentException {
		 if(amount>balance) {
			 throw new IllegalArgumentException ("Insufficient balance!");
		 }
		 balance-=amount;
	 }
	 public void displayAccount() {
		 System.out.println("Account Number:- "+accountNumber);
		 System.out.println();
		 System.out.println("Account Holder:- "+accountHolderName);
		 System.out.println();
		 System.out.println("Balance       :-  ₹"+balance);
		 System.out.println();
	 }

}
