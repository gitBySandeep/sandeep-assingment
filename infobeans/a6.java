/*27. Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95% */

import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int bs, hra, da, gs;
		System.out.print("enter any salary\t");
		bs = sc.nextInt();

		if (bs > 20000) {
			hra = (bs * 30) / 100;
			da = (bs * 95) / 100;
			gs = bs + hra + da;
			System.out.print("gross salary=\t" + gs);
		}

		if (bs > 10000 && bs <= 20000) {
			hra = (bs * 25) / 100;
			da = (bs * 90) / 100;
			gs = bs + hra + da;
			System.out.print("gross salary=\t" + gs);
		}

		if (bs <= 10000) {
			hra = (bs * 20) / 100;
			da = (bs * 80) / 100;
			gs = bs + hra + da;
			System.out.print("gross salary=\t" + gs);
		}
	}
}