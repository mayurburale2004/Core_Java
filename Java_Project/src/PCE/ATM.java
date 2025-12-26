package PCE;

import java.util.Scanner;

public class ATM {
	
	static void withdraw(int bal, int with) {
		// logic here
		if(with > bal) {
			  throw new ArithmeticException("Insufficient Balance");
		}else {
			bal= bal-with;
			System.out.println("Withdraw Successfull");
			System.out.println("Remaining Balance is:"+bal);
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Balance Amount");
			int bal = sc.nextInt();
			System.out.println("Enter a WithDraw Amount");
			int with = sc.nextInt();
			withdraw(bal,with);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Transaction Finished");
		}
		
		
		sc.close();

	}

}
