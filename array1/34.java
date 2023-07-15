// kth element  of two shorted arrays 
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		System.out.println("size of second array ");
		m = sc.nextInt();

		int a[] = new int[n];
		int a1[] = new int[m];
		int a2[] = new int[n + m];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("element of second array");
		for (int j = 0; j < m; j++) {
			a1[j] = sc.nextInt();
		}

		for (int i = 0; i < n + m; i++) {
			if (i < n) {
				a2[i] = a[i];
			} else {
				a2[i] = a1[i - n];
			}
		}

		int temp = 0;
		for (int i = 0; i < n + m; i++) {
			for (int j = i + 1; j < n + m; j++) {
				
				if (a2[i] > a2[j]) {
					temp = a2[i];
					a2[i] = a2[j];
					a2[j] = temp;
				}
			}
			System.out.println("the final sorted array" + a2[i]);
		}
		System.out.println("enter index number :");
		int k = sc.nextInt();
		System.out.println("the" + k + "element of this array is:" + a2[k - 1]);
	}
}
