// sum and product of all number
import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int sum = 0, p = 1;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("enter number");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			sum = sum + a[i];
			p = p * a[i];
		}
		System.out.println("sum of all number=" + sum);
		System.out.print("product of all number=" + p);
	}
}
