//print leader element
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		int i, j;

		int a[] = new int[n];

		System.out.println("element of first array");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int count = 0;
		System.out.println("all Leaders element");
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i]<=a[j])
					break;
			}
			if (j==n)
				System.out.println(a[i]);
		}
	}
}
