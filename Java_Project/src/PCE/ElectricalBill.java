package PCE;
import java.util.Scanner;
public class ElectricalBill {
	   public static void main(String[] args) {
	        Scanner sc =  new Scanner(System.in);
	        System.out.println("Enter the Bill unit:- ");
	        int unit = sc.nextInt();
	        if(unit<=100){
	            System.out.println("The Total bill Ammount is :- "+unit*3);
	        } else if (unit>=100 && unit<=200) {
	            int slot =unit-100;
	            int total=slot*5+100*3;
	            System.out.println("The Total bill Ammount is :- "+total);
	        }
	        else{
	            int slot =unit-200;
	           
	            int total=slot*7+100*5+100*3;
	            System.out.println("The Total bill Ammount is :- "+total);
  
	        }
	        sc.close();
	    }
	  
	}



