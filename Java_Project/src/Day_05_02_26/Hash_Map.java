package Day_05_02_26;

import java.util.*;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap map = new HashMap();
map.put(919,1);
map.put(992,2);
map.put(992,4);
map.put(993,6);
map.put(99,2);
map.put(99,8);
map.put(99,7);
map.put(99,1);
map.put(99,3);
map.put(99,1);
map.put(99,1);
Set s=map.keySet();
Iterator it = s.iterator();
while (it.hasNext()) {
  System.out.println(it.next());      
}
System.out.println(map.entrySet());

	}
	

}
