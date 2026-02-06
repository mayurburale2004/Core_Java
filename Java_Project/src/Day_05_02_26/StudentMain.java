package Day_05_02_26;

import java.util.HashMap;
import java.util.TreeMap;

public class StudentMain {

public static void main(String[] args) {

Student st = new Student(101,"Mayur",22,"Male",45555,90,7,"mayur@gmail.com","Nagpur",5.52,60,"O+");
Student st1 = new Student(103,"Tushar",22,"Male",45555,90,7,"Tushar@gmail.com","Akola",6.52,65,"O+");
Student st2 = new Student(102,"Rupa",22,"Male",45555,90,7,"Rupa@gmail.com","Bhandara",4.52,62,"B+");
Student st3 = new Student(104,"Yash",22,"Male",45555,90,7,"Yash@gmail.com","Gondiya",5.62,63,"O-");
TreeMap<Student,Integer> map = new TreeMap<>();
map.put(st, 201);
map.put(st1, 202);
map.put(st3, 204);
map.put(st2, 203);

System.out.println(map);
	}

}

