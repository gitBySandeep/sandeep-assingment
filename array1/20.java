/*expected output
Write a Java program to print the following grid.
Expected Output :
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -*/
import java.util.Scanner;

class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array limit");
		int b = sc.nextInt();
		int d = sc.nextInt();
		int a[][] = new int[b][d];

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < d; j++) {
				System.out.print("-");
			}
			System.out.println("");
		}

	}
}
