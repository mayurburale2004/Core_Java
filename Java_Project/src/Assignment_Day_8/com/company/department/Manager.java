package Assignment_Day_8.com.company.department;
import  Assignment_Day_8.com.company.employee.Employee;
public class Manager extends Employee {
public void accessEmp() {
	System.out.println("EmpID"+empID);
	System.out.println("Salary"+salary);
	//System.out.println(departmentName);
	//System.out.println(empPassword);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m   =new Manager();
		m.accessEmp();
		
	}

}
