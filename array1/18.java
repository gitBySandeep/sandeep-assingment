//sum of all cubic value
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int c, d = 0, t = 0;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("enter number");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			c = a[i];
			d = d + c * c * c;
			t = t + d;
		}

		System.out.println("sum of all cubic value" + t);
	}
}
