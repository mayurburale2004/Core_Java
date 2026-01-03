package Day_01_01_26;

import java.util.Scanner;

abstract class Shapes{
	double area;
	final static  double PI =3.14;
	abstract void findArea();
	abstract void dis();

	
}
 class Circle extends Shapes{
	
	double r;
	
	 Circle(double r){
		 this.r=r;
		 
	 }
	 
	 void findArea() {
		 area=PI*r*r;
	 }
	 void dis() {
		 System.out.println("The Area of Circle:- "+area);
	 }
 }
 class Triangle extends Shapes{
	 double b;
	 double h;
	 
	
	 Triangle(double b,double h){
		 this.b=b;
		 this.h=h;
		 
	 }
	  void findArea() {
		  area = 0.5*b*h;
	 }
	 void dis() {
		 System.out.println("The Area of Triangle:- "+area);
	 }
 }
 
 class Square extends Shapes{
	 double side;
	
	 Square( double side){
		 this.side=side;
	 }
	 void findArea() {
		 area=side*side;
	 }
	 void dis() {
		 System.out.println("The Area of Square:- "+area); 
	 }
 }
 
public class AreaOfShapes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Option :- ");
		System.out.print("1. Circle   ");
		System.out.print("2. Triangle   ");
		System.out.println("3. Square   ");
		int opt=sc.nextInt();
		  Shapes shape = null;
		switch(opt) {
		case 1:{
			System.out.println("Enter the radius of Circle :- ");
			double radius =sc.nextDouble();
			shape=	new Circle(radius);
			break;
		}
case 2:{
	System.out.println("Enter the breadth of Triangle :- ");
	double breadth =sc.nextDouble();
	System.out.println("Enter the length of Triangle :- ");
	double length =sc.nextDouble();
	shape=new Triangle(breadth,length);
	
	break;
		}
case 3:{
	System.out.println("Enter the side of Square :- ");
	double side =sc.nextDouble();
	shape=new Square(side);
	break;
}
default:
   System.out.println("Enter the Valid Option ");
    break;

		
		}
		shape.findArea();
		shape.dis();
	
		
	}

}
