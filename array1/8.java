//sum of all integer
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("enter number");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(" " + a[i]);
			sum = sum + a[i];
		}
		System.out.print("sum of all number" + sum);
	}
}
