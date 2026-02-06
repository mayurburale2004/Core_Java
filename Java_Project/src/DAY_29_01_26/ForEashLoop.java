package DAY_29_01_26;

import java.util.ArrayList;

public class ForEashLoop {

	public static void main(String[] args) {
		
		ArrayList<String> ans = new ArrayList();
		
		ans.add("Mayur");
		ans.add("Rupa");
		ans.add("Kaushik");
		ans.add("Tushar");
		ans.add("Yash");
		ans.add("Ram");
		
		for( String ele:ans) {
			System.out.println(ele);
		}
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
			
		}
		
	}

}
