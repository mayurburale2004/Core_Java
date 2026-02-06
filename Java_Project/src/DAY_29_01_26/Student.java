package DAY_29_01_26;

public class Student {
	String name;
	int age;
	String gender;
	Student(String name,
	int age,
	String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public String getName(String name) {
		return name;
	}
public int getAge(int age) {
	return age;
}
public String getGender(String gender) {
	return gender;
}
	public static void main(String[] args) {
		
		Student s1 = new Student("Mayur",22,"Male");
		Student s2 = new Student("Rupa",20,"Female");
		Student s3 = new Student("Yash",22,"Male");
		Student s4 = new Student("paro",21,"Female");
		Student [] arr= {s1,s2,s3,s4};
		for(Student stu:arr) {
			System.out.println(stu.name);
		}
	}

}
