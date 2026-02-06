package Day_04_02_26;

import java.util.ArrayList;
import java.util.Collections;

public class SortingComplexObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(210);
		al.add(120);
		al.add(320);
		al.add(25023);
		al.add(207);
		al.add(209);
		al.add(6);
		Collections.sort(al);
		Collections.reverse(al);
		
		System.out.println(al);
		
		

	}

}
