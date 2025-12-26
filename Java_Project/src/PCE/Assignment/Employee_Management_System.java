package PCE.Assignment;

abstract class Employee{
	int id; 
	String name;
	Employee(int id ,String name){
		this.id=id;
		this.name=name;
	}
	
	abstract double calculateSalary();
	void display() {
		System.out.println("Employee: "+name);
		System.out.println("Salary: "+calculateSalary());
	}
}
class FullTimeEmployee extends Employee{
	double monthlySalary;
	FullTimeEmployee(int id , String name , double monthlySalary){
		super(id ,name);
		this.monthlySalary=monthlySalary;
	}
	double calculateSalary() {
		return monthlySalary;
	}
}
class PartTimeEmployee extends Employee{
	int hours;
	double rate;
	PartTimeEmployee(int id ,String name , int hours ,double rate){
		super(id,name);
		this.hours=hours;
		this.rate=rate;
	}
	double calculateSalary() {
		return hours*rate;
	}
	
}
public class Employee_Management_System {

	public static void main(String[] args) {
	
		Employee[] e=new Employee[2];
		e[0]=new FullTimeEmployee(1,"Ravi",45220);
		e[1]=new PartTimeEmployee(2 ,"Mayur",250,452);
		for(Employee emp:e) {
			emp.display();
			System.out.println();
		}

	}

}
