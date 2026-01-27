package Day_03_01_25;

import java.util.Scanner;

public class ExceptionHandl {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter the Numbers 1st:- ");
			int a = sc.nextInt();
			System.out.println("Enter the Numbers 2nd:- ");
			int b = sc.nextInt();
			System.out.println(a / b);

			System.out.println("Enter the Array Size:- ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			arr[size] = 99;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("End of the program");
		}
		//sc.close();
	}

}
