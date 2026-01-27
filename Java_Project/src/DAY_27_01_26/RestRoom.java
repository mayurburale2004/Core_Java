package DAY_27_01_26;

public class RestRoom {

	public static void main(String[] args) throws InstantiationException  {
		Room r = new Room();
		Thread t1 =new Thread(r);
		Thread t2 =new Thread(r);
		Thread t3 =new Thread(r);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		
		t2.start();
	
		t3.start();
	


	}


}
class Room implements Runnable{

	@Override
	public void run() {
		
		try {
			String tName=Thread.currentThread().getName();
			System.out.println(tName+"is Enter in Room");
			Thread.sleep(3000);
			System.out.println(tName+"is using  in Room");
			Thread.sleep(3000);
			System.out.println(tName+"is Exiting  in Room");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
