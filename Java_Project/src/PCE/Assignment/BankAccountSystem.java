package PCE.Assignment;

import java.util.HashMap;
import java.util.Map;

public class BankAccountSystem {

	public static void main(String[] args) {

		Map<Integer,String>map = new HashMap<>();
		map.put(10225, "Mayur");
		map.put(10255, "Yash");
		map.put(10245, "Rupa");
		map.put(10265, "Amit");
		
		System.out.println("Account Details:- ");
		
		for(Map.Entry<Integer, String>entry:map.entrySet()) {
			System.out.println("Account No:- "+entry.getKey()+" Name "+entry.getValue());
		}
		

	}

}
