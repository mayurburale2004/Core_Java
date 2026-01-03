package Day_03_01_25;


class Parent{
	static void dis() {
		System.out.println("This is Parant Class------");
	}
}
class child extends Parent{
	static void dis() {
		System.out.println("This is Child Class------");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Parent p =new Parent();
		p.dis();
		child c =new child();
		c.dis();
		Parent p1  = new child();
		p1.dis();

	}

}
