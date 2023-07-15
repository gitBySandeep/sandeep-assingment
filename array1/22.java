
// Duplicate number
import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int b = sc.nextInt();
		int a[] = new int[b];

		for (int i = 0; i < b; i++) {
			System.out.println("enter number");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < b; i++) {
			for (int j = i + 1; j < b; j++) {
				if (a[i] == a[j])
					System.out.println("Duplicate number is :" + a[i]);

			}
		}
	}
}