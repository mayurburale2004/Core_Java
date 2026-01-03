package Day_02_01_25;

import java.util.Scanner;
class MayurInfotech implements Interface{
	public void add() {
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a=10;
		int b=5;
		int c=a-b;
		System.out.println(c);
		
	}
	public void mul() {
		int a=10;
		int b=5;
		int c=a*b;
		System.out.println(c);
	}
	public void div() {
		int a=10;
		int b=5;
		int c=a/b;
		System.out.println(c);
	}
	}
class YashInfo implements Interface {
	 static Scanner sc = new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter the value of a:- ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:- ");
		int b=sc.nextInt();
		System.out.println("The Add is :- "+(a+b));
		
	}

	@Override
	public void sub() {
		System.out.println("Enter the value of a:- ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:- ");
		int b=sc.nextInt();
		int c=a-b;
		System.out.println("The Sub is :- "+c);
		
	}

	@Override
	public void mul() {
		System.out.println("Enter the value of a:- ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:- ");
		int b=sc.nextInt();
		System.out.println("The Mul is :- "+(a*b));
		
	}

	@Override
	public void div() {
		System.out.println("Enter the value of a:- ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:- ");
		int b=sc.nextInt();
		System.out.println("The div is :- "+(a/b));
			}
}
public class CodeCal {
	

	public static void main(String[] args) {
	
		 Interface obj2 = new YashInfo();       
	    
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Oprater");
	        char ch = sc.next().charAt(0);
	        switch(ch) {
	        case '+':{
	        	obj2.add();
	        	break;
	        }
	        case '-':{
	        	obj2.sub();
	        	break;
	        }
	        case '*':{
	        	obj2.mul();
	        	break;
	        }
	        case '/':{
	        	obj2.div();
	        	break;
	        }
	        default:
                System.out.println("Invalid Operator ❌");
	        }
	        
		
		
	}


}
