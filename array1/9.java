//print max and min;
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("enter number");
			a[i] = sc.nextInt();
		}

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < 5; i++) {
			if (max < a[i])
				max = a[i];

			if (min > a[i])
				min = a[i];
		}
		System.out.println("maximum number" + max);
		System.out.println("minimum number" + min);
	}
}
