package Day_04_02_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeApp {

	
	public static void main(String[] args) {

		Employee emp = new Employee(101,"Mayur",20000);
		Employee emp1 = new Employee(103,"Tushar",40000);
		
		Employee emp2 = new Employee(102,"Pavan",500000);
		
		//System.out.println(emp.toString());
		ArrayList <Employee> al = new ArrayList<Employee>();
		al.add(emp);
		al.add(emp1);
		al.add(emp2);
		
		sortComplexObj st = new sortComplexObj();
		Collections.sort(al,st);
	
		
		System.out.println(al);

	}


}
class sortComplexObj implements Comparator<Object>{
	@Override
	public int  compare(Object o1, Object o2) {
		
		//Used for Integer type of data can be sort
	    /*	if(((Employee)(o1)).id>((Employee)(o2)).id) {
			return -1;
			
		}
		return 1;*/
		
		//Used for String type of data can be sort
	 int res=(((Employee)(o1)).name).compareTo(((Employee)(o2)).name);
		if(res>0) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
