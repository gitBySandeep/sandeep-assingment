//48) WAP to find out the factors of all the numbers between two entered numbers
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n, n1, s = 0, i, j;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		System.out.println("enter any number");
		n1 = sc.nextInt();
		System.out.println("factor of number\n" + n);
		for (i = n; i <= n1; i++) {
			for (j = 1; j <= i / 2; j++) {
				if (i % j == 0)

					System.out.println(j);
			}
			System.out.println("");

		}
	}
}