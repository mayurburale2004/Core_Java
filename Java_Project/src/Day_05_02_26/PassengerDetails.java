package Day_05_02_26;
import java.util.ArrayList;

import java.util.Collections;

public class PassengerDetails {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger pd = new Passenger(201,"Mayur","Hingan","Ralegaon","Bus");
		Passenger pd1 = new Passenger(203,"Tushar","Yavatmal","Ralegaon","Bick");
		Passenger pd2 = new Passenger(204,"Rupa","Nagpur","Hinganghat","Train");
		Passenger pd3 = new Passenger(202,"Yash","Nagpur","Wani","Bus");
		ArrayList al = new ArrayList();
		al.add(pd);
		al.add(pd1);
		al.add(pd2);
		al.add(pd3);
		Collections.sort(al);
		System.out.println(al);
		
	}
	



}
 class Passenger implements Comparable{
	int id;
	String name;
	String form;
	String to;
	String medium;
	public Passenger(int id, String name, String form, String to, String medium) {
		super();
		this.id = id;
		this.name = name;
		this.form = form;
		this.to = to;
		this.medium = medium;
	}
	

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getForm() {
		return form;
	}



	public String getTo() {
		return to;
	}



	public String getMedium() {
		return medium;
	}



	
	public String toString() {
		return id+" "+name+" "+form+" "+to+" "+medium ;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setForm(String form) {
		this.form = form;
	}



	public void setTo(String to) {
		this.to = to;
	}



	public void setMedium(String medium) {
		this.medium = medium;
	}


	@Override
	public int compareTo(Object o) {
		
		if(this.id>((Passenger)(o)).id){
			return 1;
			
		}
		return -1;
	}


}

