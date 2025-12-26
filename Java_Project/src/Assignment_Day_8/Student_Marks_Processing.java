package Assignment_Day_8;

import java.util.*;

public class Student_Marks_Processing {

	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(45,80,89,56,20);
int total_Marks=marks.stream()
.filter(m->m>=40)
.map(m->m+5)
.reduce(0, Integer::sum);
System.out.println("The Total Marks of Student id :- "+total_Marks);
	}

}