//49) WAP to find out all the perfect numbers between two entered numbers
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n = 0, n1, i, j, t = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		System.out.println("enter any number");
		n1 = sc.nextInt();

		for (i = n; i <= n1; i++) {
			for (j = 1; j <= i / 2; j++) {
				if (i % j == 0)
					t = t + j;
			}
			if (i == t)
				System.out.print(i + "is perfect num");
			t = 0;
		}

	}
}