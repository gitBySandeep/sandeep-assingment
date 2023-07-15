//majority element in a sorted array
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
		int m = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j])
					m = a[i];
			}
		}
		System.out.print("majority Element :" + m);
	}
}