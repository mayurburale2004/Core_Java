package Project;

import java.util.Scanner;

class ATM {
	void transaction() throws Exception {
		System.out.println("ATM Connection Established");
		Scanner sc = new Scanner (System.in);
		System.out.println("Please Enter the Value:- ");
		int a=sc.nextInt();
		System.out.println("Please Enter the Value:- ");
		int b=sc.nextInt();
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Exception is Handeled by ATM");
			throw e;
			
		}
		System.out.println("Bank");
		
	}
}
class Bank{
	void banking() {
		System.out.println("Bank Connection Established");
		ATM card = new ATM();
	}
}

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
