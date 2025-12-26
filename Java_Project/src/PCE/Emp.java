package PCE;

class Employee1 extends Object{
	int emp_id;
	String name;
	int salary;
	public Employee1(int emp_id,String name, int salary) {
		
		this.emp_id=emp_id;
		this.name=name;
		this.salary=salary;
	}
public Employee1() {
		this(102,"Mayur",2025);
		
}
	public int getemp_id() {
		return emp_id;
		
	}
	public String getName() {
		return name;
		
	}
	public int getSalary() {
		return salary;
		
	}
	
}

public class Emp {

	public static void main(String[] args) {

		Employee1 e = new Employee1();
		System.out.println(e.getemp_id());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
				
	}

}