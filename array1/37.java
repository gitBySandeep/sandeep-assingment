//sum of element  b/w to indices
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("enter first index to start sum");
		int k = sc.nextInt();

		System.out.println("enter last index to end sum");
		int m = sc.nextInt();

		int sum = 0;
		for (int i = k; i <= m; i++) {
			sum = sum + a[i];
		}

		System.out.println(sum + "  " + "is total sum of indexes element");
	}
}