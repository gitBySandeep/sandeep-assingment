//57) WAP to print all the prime numbers between two entered numbers
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n, n1, i;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		System.out.println("enter any number");
		n1 = sc.nextInt();

		while (n < n1) {
			boolean take = false;
			for (i = 2; i <= n / 2; ++i) {
				if (n % i == 0) {
					take = true;
					break;
				}
				if (take)
					System.out.println(n + "is a prime number ");
				++n;
			}
		}
	}
}