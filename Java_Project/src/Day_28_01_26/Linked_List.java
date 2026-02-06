package Day_28_01_26;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList ll = new LinkedList();
  ll.add(10);
  ll.addFirst(20);
  ll.add(1, 2l);
  ll.add(30);
  ll.addLast(232);
  ll.push(20);
  System.out.println(ll);
  System.out.println(ll.getLast());
	}

	
}
