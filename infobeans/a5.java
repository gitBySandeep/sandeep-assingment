//11. Find even odd using switch case 

import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("enter any number");
		n = sc.nextInt();

		switch (n % 2) {
			case 0:

				System.out.println("even");

				break;
			case 1:

				System.out.println("odd");

				break;
			default:

				System.out.println("default");
		}
	}
}