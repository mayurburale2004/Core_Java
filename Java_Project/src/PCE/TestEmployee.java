package PCE;

	class Employee { 
	static String companyName = "TCS"; 
	final int empId; 
	String name; 
	double salary; 
	Employee(int empId, String name, double salary) { 
	     this.empId=empId;
	     this.name=name;
	     this.salary=salary;
	    } 
	} 
	 
	class Manager extends Employee { 
	    String department; 
	 
	    Manager(int empId, String name, double salary, String 
	department) { 
	        super(empId,name,salary);
	        this.department= department;
	    } 
	 
	    void display() { 
	        System.out.println("Company: "+companyName);
	        System.out.println("ID: "+empId);
	        System.out.println("Name: "+name);
	        System.out.println("Salary: "+salary);
	        System.out.println("Department: "+department);
	    } 
	} 
	 
	class TestEmployee { 
	    public static void main(String[] args) { 
	    	Manager m= new Manager(201,"Mayur",20000,"IT");
	    	m.display();
	    } 
	}


