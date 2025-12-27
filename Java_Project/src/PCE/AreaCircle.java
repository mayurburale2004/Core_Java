package PCE;


class Circle{
	int r;
	double pi;
	public Circle(int r, double pi){
		this.r=r;
		this.pi=pi;
		
	
	}
	 void disp() {
	double Area=pi*r*r;
	System.out.println(Area);
		
	}
}
public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(7,3.14);
		c.disp();
	}

}
