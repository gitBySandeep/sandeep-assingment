
import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		char ch;
		System.out.print("enter first number\t");
		n1 = sc.nextInt();
		System.out.print("enter second number\t");
		n2 = sc.nextInt();
		System.out.print("enter any charecter\t");
		ch = sc.next().charAt(0);
		switch (ch) {

			case '+':
				System.out.print("add of two number\t" + (n1 + n2));
				break;

			case '-':
				System.out.print("sub of two number\t" + (n1 - n2));
				break;

			case '*':
				System.out.print("multiply of two number\t" + (n1 * n2));
				break;

			case '/':
				System.out.print("divide of two number\t" + (n1 / n2));
				break;

			case '%':
				System.out.print("modulo of two number\t" + (n1 % n2));
				break;

			default:

				System.out.print("default\t");
		}
	}
}
