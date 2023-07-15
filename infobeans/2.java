
import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.print("enter any charecter\t");
		ch = sc.next().charAt(0);

		if (ch == '+') {
			int a, b;
			System.out.print("enter first number \t");
			a = sc.nextInt();
			System.out.print("enter second number \t");
			b = sc.nextInt();
			System.out.print("add =\t" + (a + b));
		}
		if (ch == '>') {
			int p, q;
			System.out.print("enter first number \t");
			p = sc.nextInt();
			System.out.print("enter second number \t");
			q = sc.nextInt();
			if (p > q) {
				System.out.print("p is greatest=" + p);
			} else {
				System.out.print("q is greatest=" + q);
			}
		}
		if (ch == '=') {
			int x, y;
			System.out.print("enter first number=\t");
			x = sc.nextInt();
			System.out.print("enter second number=\t");
			y = sc.nextInt();
			if (x == y) {
				System.out.print("equal");
			}
			{
				System.out.print("x is not equal to y");
			}

		}
	}
}