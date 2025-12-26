package PCE.Assignment;

import java.util.*;
class Patient{
	int id;
	String name;
	int priority;
	Patient(int id,  String name,int priority ){
		this.id=id;
		this.name=name;
		this.priority =priority;
	}
}
public class HospitalManegment {
	

	public static void main(String[] args) {
		List<Patient> patient =new ArrayList<>();
		patient.add(new Patient (1002,"Mayur",2));
		patient.add(new Patient(102,"Ram",1));
		
		
		Set<String> set = new HashSet<>();
		set.add("10256");
		set.add("20245");
		set.add("20245");
		
		
	}

}
