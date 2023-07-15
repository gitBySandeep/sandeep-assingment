//14. WAP to find lowest number among four different number 

import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, n4;
		System.out.println("enter first number");
		n1 = sc.nextInt();
		System.out.println("enter second number");
		n2 = sc.nextInt();
		System.out.println("enter third number");
		n3 = sc.nextInt();
		System.out.println("enter fourth number");
		n4 = sc.nextInt();

		if (n1 < n2 && n1 < n3 && n1 < n4) {
			System.out.println("n1 is lowest=" + n1);
		} else if (n2 < n1 && n2 < n3 && n2 < n4) {
			System.out.println("n2 is lowest=" + n2);
		} else if (n3 < n1 && n3 < n2 && n3 < n4) {
			System.out.println("n3 is lowest=" + n3);
		} else {
			System.out.println("n4 is lowest=" + n4);
		}
	}
}
