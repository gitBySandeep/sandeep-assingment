//print even number
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("enter number");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			if (a[i] % 2 == 0)
				System.out.println("even number " + a[i]);

		}

	}
}
