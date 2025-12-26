package PCE;


class Account { 
    static String bankName = "SBI"; 
    static double interestRate = 4.5; 
 
    int accNo; 
    String holderName; 
 
    Account(int accNo, String holderName) { 
        this.accNo=accNo;
        this.holderName=holderName;
    } 
} 
 
class SavingsAccount extends Account { 
    final String accountType = "SAVINGS"; 
 
    SavingsAccount(int accNo, String holderName) { 
        super(accNo, holderName);
    } 
 
    void display() { 
    	System.out.println("Bank: "+bankName);
    	System.out.println("Account Holder: "+holderName);
    	System.out.println("Account No: "+accNo);
    	System.out.println("Account Type: "+accountType);
    	System.out.println("Interest Rate:  "+interestRate+"%");
} 
} 
class TestBank { 
public static void main(String[] args) { 
	SavingsAccount SA =new SavingsAccount(101,"Amit");
	SA.display();
} 
}
