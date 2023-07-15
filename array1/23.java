// add two matrics of sam size
import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int b = sc.nextInt();
		System.out.println("enter the size of second  array");
		int c = sc.nextInt();
		int a[][] = new int[b][c];

		System.out.println("enter number");
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter data");

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("  " + a[i][j]);
			}
			System.out.println();
		}
	}
}
