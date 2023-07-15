//56) WAP to print factorial of all the numbers between two entered numbers
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n, n1, i, j, s = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		System.out.println("enter any number");
		n1 = sc.nextInt();

		for (i = n; i <= n1; i++) {
			for (j = 1; j <= i; j++) {
				s = i * j;
			}
			System.out.println(+s + " is a factorial number" + i);
			s = 0;
		}

	}
}