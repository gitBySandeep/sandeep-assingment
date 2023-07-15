//51) WAP to reverse all the numbers between two entered numbers
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n, n1, rev = 0, r, i, j;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		System.out.println("enter any number");
		n1 = sc.nextInt();

		for (i = n; i <= n1; i++) {
			for (j = i; j > 0;) {
				r = j % 10;
				j = j / 10;
				rev = rev * 10 + r;

			}
			System.out.println(rev + " is reverse number");
			rev = 0;
		}
	}
}