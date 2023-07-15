// how many time zero in array
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("limit of array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int count = 0;
		System.out.println("number of zero in array elements");
		for (int i = 0; i < n; i++) {
			if (a[i] == 0)
				count++;
		}
		System.out.println(count);
	}
}