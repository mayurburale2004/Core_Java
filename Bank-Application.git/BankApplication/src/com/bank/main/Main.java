package com.bank.main;

import java.util.Scanner;

import com.bank.exception.InsufficientBalanceException;
import com.bank.model.Account;
import com.bank.service.Bank;

public class Main {

	 public static void main(String[] args) {

	        Bank bank = new Bank();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            try {
	                System.out.println("\n===== BANK MENU =====");
	                System.out.println("1. Create Account");
	                System.out.println("2. Deposit");
	                System.out.println("3. Withdraw");
	                System.out.println("4. Check Balance");
	                System.out.println("5. Transfer Money");
	                System.out.println("6. Exit");
	                System.out.print("Enter choice: ");

	                int choice = sc.nextInt();

	                switch (choice) {

	                    case 1:
	                        System.out.print("Account Number: ");
	                        int accNo = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Name: ");
	                        String name = sc.nextLine();
	                        System.out.print("Initial Balance: ");
	                        double bal = sc.nextDouble();

	                        bank.addAccount(new Account(accNo, name, bal));
	                        break;

	                    case 2:
	                        System.out.print("Account Number: ");
	                        accNo = sc.nextInt();
	                        System.out.print("Amount: ");
	                        double amount = sc.nextDouble();

	                        Account depAcc = bank.findAccount(accNo);
	                        if (depAcc == null)
	                            throw new NullPointerException("Account not found!");

	                        depAcc.deposit(amount);
	                        System.out.println("Deposit successful!");
	                        break;

	                    case 3:
	                        System.out.print("Account Number: ");
	                        accNo = sc.nextInt();
	                        System.out.print("Amount: ");
	                        amount = sc.nextDouble();

	                        Account wAcc = bank.findAccount(accNo);
	                        if (wAcc == null)
	                            throw new NullPointerException("Account not found!");

	                        wAcc.withdraw(amount);
	                        System.out.println("Withdrawal successful!");
	                        break;

	                    case 4:
	                        System.out.print("Account Number: ");
	                        accNo = sc.nextInt();

	                        Account chkAcc = bank.findAccount(accNo);
	                        if (chkAcc == null)
	                            throw new NullPointerException("Account not found!");

	                        chkAcc.displayAccount();
	                        break;

	                    case 5:
	                        System.out.print("From Account: ");
	                        int from = sc.nextInt();
	                        System.out.print("To Account: ");
	                        int to = sc.nextInt();
	                        System.out.print("Amount: ");
	                        amount = sc.nextDouble();

	                        bank.transferMoney(from, to, amount);
	                        break;

	                    case 6:
	                        System.out.println("Thank you for using Bank Application!");
	                        sc.close();
	                        System.exit(0);

	                    default:
	                        System.out.println("Invalid choice!");
	                }

	            } catch (InsufficientBalanceException e) {
	                System.out.println("Error: " + e.getMessage());

	            } catch (IllegalArgumentException e) {
	                System.out.println("Invalid Input: " + e.getMessage());

	            } catch (Exception e) {
	                System.out.println("Error: Please enter valid input!");
	                sc.nextLine(); // clear buffer
	            }
	        }
	    }

}
