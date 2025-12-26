package PCE.Assignment;

import java.util.*;

public class LMS {
	public static void main(String[] args) {
		List<String> course = new ArrayList<>();
		course.add("C");
		course.add("C++");
		course.add("JAVA");
		course.add("NODE");
		course.add("REACT");
		System.out.println("Courses:- "+course);
		Set<String> stu = new HashSet<>();
		stu.add("mayur@123");
		stu.add("ram@123");
		stu.add("sham@123");
		stu.add("roshan@123");
		System.out.println("Student Email:- "+stu);
		Set<String> recentCourse = new LinkedHashSet<>();
		recentCourse.add("JAVA");
		recentCourse.add("REACT");
		System.out.println("Recent Courses:- "+recentCourse);
		Queue<String>doubts = new PriorityQueue<>();
		doubts.add("Normal Student");
		doubts.add("Merit Student");
		System.out.println("Doubts:- "+doubts);
		Deque<String >DQ = new ArrayDeque<>();
		DQ.add("In JAVA");
		DQ.add("IN Python");
		System.out.println("Histroy:- "+DQ);
		Map<String ,String> enroll = new HashMap<>();
		enroll.put("Mayur@gmail.com","JAVA");
		enroll.put("Ram@gmail.com", "Node.js");
		System.out.println("Enrollement:- "+enroll);
		Map<String ,String> sc =new TreeMap<>();
		sc.put("16/12/2025","JAVA");
		sc.put("16/02/2024","Python");
		System.out.println("Schedul"+sc);
		
		Iterator<String> iter =  stu.iterator();
		while(iter.hasNext()) {
			if(iter.next().equals("roshan@123")) {
				iter.remove();
				
			}
		}
		System.out.println("Student Email:- "+stu);
		ListIterator<String> listiter = course.listIterator();
		while(listiter.hasNext()) {
			if(listiter.next().equals("REACT")) {
				listiter.set("C#");
			}
		}
		System.out.println("Courses After Update:- " + course);

	}

}
