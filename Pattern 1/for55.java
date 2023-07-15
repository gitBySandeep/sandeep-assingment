//55) WAP to print all the odd numbers between two entered numbers
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n, n1, i, j;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		System.out.println("enter any number");
		n1 = sc.nextInt();

		for (i = n; i <= n1; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " is odd number");
			}
		}
	}
}