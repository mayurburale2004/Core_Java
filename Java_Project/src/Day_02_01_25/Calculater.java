package Day_02_01_25;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input:- ");
		String str =sc.next();
		int result=0;
		if(str.contains("+")) {
			String part[]=str.split("\\+");
			int a=Integer.parseInt(part[0]);
			int b=Integer.parseInt(part[1]);
			result=a+b;
			
		}
		else if(str.contains("-")) {
			String part[]=str.split("\\-");
			int a=Integer.parseInt(part[0]);
			int b=Integer.parseInt(part[1]);
			result=a-b;
			
		}
		else if(str.contains("*")) {
			String part[]=str.split("\\*");
			int a=Integer.parseInt(part[0]);
			int b=Integer.parseInt(part[1]);
			result=a*b;
			
		}
		
		else if(str.contains("/")) {
			String part[]=str.split("\\/");
			int a=Integer.parseInt(part[0]);
			int b=Integer.parseInt(part[1]);
			result=a/b;
			
		}
		else {
			System.out.println("Invalid Input");
		}
		
		System.out.print(result);

	}

}
