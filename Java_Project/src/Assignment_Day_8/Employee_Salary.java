package Assignment_Day_8;

import java.util.*;

public class Employee_Salary {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(20000, 30000, 40000, 50000);
		int Total_Payroll=salaries.stream()
.filter(s->s>30000)
.map(s->s+(s*10/100))
.reduce(0, Integer:: sum);
		
		System.out.println("Total Payroll After Bonus:- "+Total_Payroll);
		
	}

}
