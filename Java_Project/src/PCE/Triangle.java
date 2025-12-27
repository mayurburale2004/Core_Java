package PCE;

import java.util.Scanner;

class Area_Tri{
	double h;
	double b;
	static double c=1/2f;
	Area_Tri(double h, double b){
		this.h=h;
		this.b=b;
	}
	
	public double Area() {
		return c*h*b;
	}
	
}
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height:- ");
		double h=sc.nextDouble();
		System.out.println("Enter the base:- ");
		double b=sc.nextDouble();
		Area_Tri at = new Area_Tri(h,b);
		
		System.out.println("The Area of Triangle:- "+at.Area());
	}

}
