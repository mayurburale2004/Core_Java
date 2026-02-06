package Day_04_02_26;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Employee {
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}

/*	public int compareTo(Object o) {
		if(this.id>(((Employee)(o)).id)) {
			return 1;
		}
		else {
			return -1;
		}
		
	}*/
	

}