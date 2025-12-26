package PCE.Assignment;
import java.util.ArrayList;
import java.util.List;

class Student{
	int id;
	String name;
	double marks;
	Student(int id ,String name,double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	void display() {
		System.out.println("Id:"+id+" Name:"+name+" Marks:"+marks);
	}
}
public class StudentManagement {

	public static void main(String[] args) {
		List<Student>stu= new ArrayList<>();
		stu.add(new Student(1 ,"Mayur",90));
		stu.add(new Student(2 ,"Rupa",90));
	
		for(Student s:stu) {
			s.display();
		}

	}

}
