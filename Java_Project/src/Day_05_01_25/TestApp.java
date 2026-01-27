package Day_05_01_25;

import java.util.Scanner;

class Test1{
	void alpha() {
		System.out.println("Conn 1st Esta");
		Test2 t2 = new Test2();
		t2.beta();
		System.out.println("Conn 1st Term");
	}
}
class Test2{
	void beta() {
		System.out.println("Conn 2st Esta");
		Test3 t3 = new Test3();
		try {
			t3.gama();
		}
catch(Exception e ) {
			
			System.out.println("-------Exception handled by Gama------- ");
			e.printStackTrace();
		
		}
		
		System.out.println("Conn 2nd  Term");
	}
}
class Test3{
	void gama() {
		System.out.println("Conn 3st Esta");
	//	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value 1");
		int a=sc.nextInt();
		System.out.println("Enter Value 2");
		int b=sc.nextInt();
		int c=a/b;
	//	}
	/*	catch(Exception e ) {
			
			System.out.println("-------Exception handled by Gama------- ");
			e.printStackTrace();
		
		}*/
		System.out.println("Conn 3rd Term");
	}
}
public class TestApp {

	public static void main(String[] args) {
		System.out.println("Conn main Esta");
		Test1 t1 = new Test1();
		t1.alpha();
		System.out.println("Conn main  Term");
		
	}

}
