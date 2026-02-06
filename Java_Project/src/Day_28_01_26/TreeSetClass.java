package Day_28_01_26;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts.contains(175));
		System.out.println(ts);
		System.out.println("-----------Upper----------");
		System.out.println(ts.ceiling(75));
		System.out.println(ts.higher(70));
		System.out.println("-----------Lower----------");
		System.out.println(ts.floor(75));
		System.out.println(ts.lower(70));
		
		System.out.println(ts.headSet(70));
		System.out.println(ts.tailSet(50));

	}

}
