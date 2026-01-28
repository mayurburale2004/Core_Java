package com.bank.service;

import java.util.ArrayList;

import com.bank.exception.InsufficientBalanceException;
import com.bank.model.Account;

public class Bank {
private ArrayList<Account>accounts = new ArrayList<>();

public void addAccount(Account acc) {
	accounts.add(acc);
	System.out.println("Account created successfully!");

}
public Account findAccount(int accNo) {
	for(Account acc : accounts) {
		if(acc.getAccountNumber()==accNo) {
			return acc;
		}
	}
	return null;
}
public void transferMoney(int fromAcc , int toAcc , double amount)
throws InsufficientBalanceException {
	Account sender =findAccount(fromAcc);
	Account receiver=findAccount(toAcc);
	if(sender==null || receiver==null) {
		throw new NullPointerException("Account not found!");
	}
	sender.withdraw(amount);
    receiver.deposit(amount);

    System.out.println("Money transferred successfully!");
}
}
