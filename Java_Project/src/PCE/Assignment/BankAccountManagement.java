package PCE.Assignment;

import java.util.HashMap;
import java.util.Map;

public class BankAccountManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String>map =new HashMap<>();
map.put(100,"Ram");
map.put(102, "Sham");
map.put(103, "Tushar");
System.out.println("Account Details:- ");
for(Map.Entry<Integer, String >entry:map.entrySet()) {
	System.out.println("ID:- "+entry.getKey()+" Name:- "+entry.getValue());
}



	}

}
