package PCE;
import java.util.Scanner;
public class Student_Grade {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Marks:- ");
	int marks=sc.nextInt();
	if(marks>=90) {
		System.out.println("The Gread of Student is:- A");
	}
	else if(marks<=90 && marks>=80) {
		System.out.println("The Gread of Student is:- B");
	}
	else if(marks<=80 && marks>=90) {
		System.out.println("The Gread of Student is:- C");
	}
	else if(marks<=70 && marks>=60) {
		System.out.println("The Gread of Student is:- D");
	}
	else if(marks<0){
		System.out.println("Invalid Number");
	}
	else {
		System.out.println("The Gread of Student is:- Faill");
	}
	sc.close();
	
}
}
