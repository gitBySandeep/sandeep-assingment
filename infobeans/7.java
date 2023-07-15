/* Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit 
For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. */

import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int ec;
		float amt, surcharge, billamount;
		System.out.print("enter electric charge\t");
		ec = sc.nextInt();

		if (ec > 0 && ec <= 50) {
			amt = (ec * 0.50f);
		}

		else if (ec <= 150) {
			amt = (ec * 0.75f);

		}

		else if (ec <= 250) {
			amt = (ec * 1.20f);
		} else {
			amt = (ec * 1.50f);
		}

		surcharge = ((amt * 0.2f));
		billamount = amt + surcharge;
		System.out.print(" total billamount" + (billamount));
	}
}