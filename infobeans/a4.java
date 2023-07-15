//24. Write a Java program to count total number of notes in given amount. 

import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, no1, no2, no3, no4, no5, no6, no7, no8, no9, no10, to;
		System.out.print("enter amount \t");
		n = sc.nextInt();

		no1 = n / 2000;
		n = n % 2000;
		no2 = n / 500;
		n = n % 500;
		no3 = n / 200;
		n = n % 200;
		no4 = n / 100;
		n = n % 100;
		no5 = n / 50;
		n = n % 50;
		no6 = n / 20;
		n = n % 20;
		no7 = n / 10;
		n = n % 10;
		no8 = n / 5;
		n = n % 5;
		no9 = n / 2;
		n = n % 2;
		no10 = n / 1;

		System.out.println("no of 2000 note =\t" + no1);
		System.out.println("no of 500 note =\t" + no2);
		System.out.println("no of 200 note =\t" + no3);
		System.out.println("no of 100 note =\t" + no4);
		System.out.println("no of 50 note =\t" + no5);
		System.out.println("no of 20 note =\t" + no6);
		System.out.println("no of 10 note =\t" + no7);
		System.out.println("no of 5 note =\t" + no8);
		System.out.println("no of 2 note =\t" + no9);
		System.out.println("no of 1 note =\t" + no10);
		to = no1 + no2 + no3 + no4 + no5 + no6 + no7 + no8 + no9 + no10;
		System.out.print("no of total note =\t" + to);

	}
}
