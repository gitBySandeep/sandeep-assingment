//46) WAP to find out the sum of first and last digit of a user entered number
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n, i, r = 0, s = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		r = n % 10;
		while (n != 0) {
			s = n % 10;
			n = n / 10;
		}
		s = s + r;
		System.out.println("sum of first and last digit " + s);

	}
}
