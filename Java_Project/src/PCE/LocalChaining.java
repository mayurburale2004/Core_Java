package PCE;


class Employees{
	int emp_id;
	String name;
	int salary;
	
	public Employees() {
		this(102,"Mayur",2010);
		System.out.println("0 parametrized Const is Called");
		
	}
	public Employees(int emp_id) {
		
		System.out.println("1 parametrized Const is Called");
		
	}

	public Employees(int emp_id ,String name) {
		this(102);
		System.out.println("2 parametrized Const is Called");
		
	}

	public Employees(int emp_id ,String name ,int salary) {
		this(102,"Mayur");
		System.out.println("3 parametrized Const is Called");
		
	}
}
public class LocalChaining {

	public static void main(String[] args) {
		Employees e = new Employees();
		

	}

}
