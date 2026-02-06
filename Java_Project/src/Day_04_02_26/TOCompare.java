package Day_04_02_26;

public class TOCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="ABCD";
String s2="EFGH";
int res=s1.compareTo(s2);
System.out.println(res);


if(res>0) {
	System.out.println("S1 is Greater");
}
else if(res<0) {
	System.out.println("S2 is Greater");
}
else {
	System.out.println("S1  & S2 is Same");
}
	}

}
