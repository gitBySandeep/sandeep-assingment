// find second largest element in array 
import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("after arranging in incresing order");

		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(+a[i]);
        min=a[o]; 
		}
		System.out.println("second largest number" + a[n - 2]);
		int i=1;
		System.out.println("second largest number" + a[i]);
	}
}