package Day_05_02_26;

public class Student {
	int id;
	String name;
	int age;
	String gender;
	int Mo;
	int marks;
	int sem;
	String email;
	String address;
	double height;
	double weight;
	String blood_Group;
	

public Student(int id, String name, int age, String gender, int mo, int marks, int sem, String email,
			String address, double height, double weight, String blood_Group) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.Mo = mo;
		this.marks = marks;
		this.sem = sem;
		this.email = email;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.blood_Group = blood_Group;
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub

	
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setGender(String gender) {
	this.gender = gender;
}
public void setMo(int mo) {
	Mo = mo;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", Mo=" + Mo + ", marks="
			+ marks + ", sem=" + sem + ", email=" + email + ", address=" + address + ", height=" + height + ", weight="
			+ weight + ", blood_Group=" + blood_Group + "]";
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getGender() {
	return gender;
}
public int getMo() {
	return Mo;
}
public int getMarks() {
	return marks;
}
public int getSem() {
	return sem;
}
public String getEmail() {
	return email;
}
public String getAddress() {
	return address;
}
public double getHeight() {
	return height;
}
public double getWeight() {
	return weight;
}
public String getBlood_Group() {
	return blood_Group;
}
public void setSem(int sem) {
	this.sem = sem;
}
public void setEmail(String email) {
	this.email = email;
}
public void setAddress(String address) {
	this.address = address;
}
public void setHeight(double height) {
	this.height = height;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public void setBlood_Group(String blood_Group) {
	this.blood_Group = blood_Group;
}
}

