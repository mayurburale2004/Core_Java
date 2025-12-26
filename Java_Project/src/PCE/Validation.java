package PCE;
import java.util.Scanner;
public class Validation {
public static void main(String[] args) {
	String username="Mayur@123";
	String password="11322551";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Username:- ");
	String user = sc.next();
	System.out.println("Enter the Password:- ");
	String pass = sc.next();
	if(username.equals(user) && password.equals(pass)) {
		System.out.println("The User Successfully Login:- "+user +" ,"+pass);
			}
	else {
		System.out.println("The User  Login Failed:- "+user+" ," +pass);
	}
	sc.close();
	}
}
