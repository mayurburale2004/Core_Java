package DAY_27_01_26;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al = new ArrayList();
al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(50.10f);
al.add("Mayur");
al.add(true);
System.out.println(al);
ArrayList arr = new ArrayList();
arr.add(100);
arr.add(90);
arr.add(80);
arr.add(70);
arr.add(60);
arr.add(50);
System.out.println(arr);
arr.addAll(al);
System.out.println(arr);
System.out.println(arr.remove(1));
System.out.println(arr.contains("Mayur"));
//arr.removeAll(arr);
al.set(0, 20);
al.retainAll(arr);
System.out.println(al);

System.out.println(arr.reversed());

	}

}
