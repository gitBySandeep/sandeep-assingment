//47) WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n, n1, s = 0, i, j;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");

		n = sc.nextInt();
		System.out.println("enter any number");
		n1 = sc.nextInt();
		for (i = n; i <= n1; i++) {
			for (j = 1; j <= 10; j++) {
				s = i * j;
				System.out.println(s);
			}
			System.out.println("");
		}
	}
}