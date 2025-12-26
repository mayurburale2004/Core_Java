package PCE.Assignment;

import java.util.HashSet;
import java.util.Set;

public class EmailRegistration {

	public static void main(String[] args) {
		Set<String>emails =new HashSet<>();
		emails.add("Mayur@gmail.com");
		emails.add("Client@gmail.com");
		emails.add("User@gmail.com");
		emails.add("Mayur@gmail.com");
		for(String email: emails) {
			System.out.println(email);
		}

	}

}
