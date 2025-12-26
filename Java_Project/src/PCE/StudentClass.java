package PCE;


public class StudentClass {
	String name;
	int age;
	String Gender;
public StudentClass(String name,int age ,String Gender) {
	this.name=name;
	this.age=age;
	this.Gender=Gender;
}


	public static void main(String[] args) {
		StudentClass  sc = new StudentClass("Mayur",22,"Male");
	}

}
