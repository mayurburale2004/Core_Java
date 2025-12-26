package PCE.Assignment;

interface Payment{
	void pay(double amount);
}
abstract class OnlinePayment{
	void generateReceipt() {
		System.out.println("Receipt generated successfully");
		
	}
}
class CreditCardPayment extends OnlinePayment implements Payment  {
	public void pay(double amount) {
		System.out.println("Payment of "+ amount+" done using UPI");
	}
}
class UPIPayment extends OnlinePayment implements Payment  {
	public void pay(double amount) {
		System.out.println("Payment of "+ amount+" done using Credit Card");
	}
}
public class Online_Payment_System {

	public static void main(String[] args) {

		Payment p ;
		p=new UPIPayment();
		
		p.pay(200);
p=new CreditCardPayment();
p.pay(20000);
	}

}
