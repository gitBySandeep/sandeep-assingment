
/*26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	 Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F
*/
import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int p, ch, b, m, c, pe;
		System.out.print("enter number of physics \t");
		p = sc.nextInt();
		System.out.print("enter number of chemistry \t");
		ch = sc.nextInt();
		System.out.print("enter number of biology \t");
		b = sc.nextInt();
		System.out.print("enter number of maths \t");
		m = sc.nextInt();
		System.out.print("enter number of physics \t");
		c = sc.nextInt();

		pe = (p + c + b + m + c) / 5;

		System.out.println("percentage= \t" + pe);

		if (pe >= 90) {
			System.out.print("Grade A ");
		}

		if (pe >= 80 && pe < 90) {
			System.out.print("Grade B ");
		}

		if (pe >= 70 && pe < 80) {
			System.out.print("Grade C ");
		}

		if (pe >= 60 && pe < 70) {
			System.out.print("Grade D ");
		}

		if (pe >= 40 && pe < 60) {
			System.out.print("Grade E ");
		}

		if (pe < 40) {
			System.out.print("Grade F ");
		}
	}
}
