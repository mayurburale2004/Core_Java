package PCE;


class Vehical{
	String company="Tata Moters";
	String Models ="Punch";
	
}
class car extends Vehical{
	int price =55455221;
	String type="Ev";
	
}
class Punch extends car{
	public void disp() {
		System.out.println("The Company of Car:- "+company);
		System.out.println("The Models of Car:- "+Models);
		System.out.println("The Price of Car:- "+price);
		System.out.println("The Type of Car:- "+type);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Punch p =new Punch();
        p.disp();
	}

}
