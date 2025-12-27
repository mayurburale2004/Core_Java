package PCE;

public class MainClassOverloading {
	// How can called Other method => methodOverloading in main method
	public static void main(int[] args) {
		System.out.println(args+"The Main Start int ");
	

	}

	public static void main(String [] args) {
		System.out.println("The Main Start");
		main();
		main(new int[] {1,2,3});
			main('A');

	}
	public static void main( ) {
		System.out.println("The Main Start not parameters");
	

	}
	public static void main( char a) {
		System.out.println("The Main Start char ");
	

	}
	
	


}
