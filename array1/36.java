//rotation count
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();

		int a[] = new int[n];
		int a1[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			
		}

		System.out.println("enter the roated array element");
		for (int i = 0; i < n; i++) {
			a1[i] = sc.nextInt();
		}

		int min = a1[0];
		for (int i = 0; i < n; i++) {
			if (a1[i] < min) {
				min = a1[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (a1[i] == min)
				System.out.println("roated count :" + " " + i);
		}
	}
}