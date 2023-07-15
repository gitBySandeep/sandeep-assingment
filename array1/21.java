// average of all number
import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int b = sc.nextInt();
		int a[] = new int[b];

		for (int i = 0; i < b; i++) {
			System.out.println("enter number");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < b; i++) {
			sum = sum + a[i];
		}
		int average = (sum / b);
		System.out.println("average of all number " + average);
	}
}
