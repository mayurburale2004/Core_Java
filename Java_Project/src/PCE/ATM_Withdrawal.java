package PCE;

import java.util.Scanner;
public class ATM_Withdrawal {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 500000;
        System.out.println("Enter the withdrawal Ammount:-  ");
        int n = sc.nextInt();
        if (bal >= n) {
            int totalbal = bal - n;
            System.out.println("The Ammount withdrawal" + n);
            System.out.println("Your remaining balance Ammount is:- " + totalbal);
        }
        else {
            System.out.println("The Ammount is insufficient the balance is :- " + bal);
        }
        sc.close();
    }
}
