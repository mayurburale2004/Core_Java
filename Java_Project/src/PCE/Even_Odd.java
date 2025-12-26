package PCE;
import java.util.Scanner;
public class Even_Odd {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:- ");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(" The Given Number is EVEN:- "+n);
		}
		else {
			System.out.println(" The Given Number is ODD:- "+n);
		}
		sc.close();
	}
}
