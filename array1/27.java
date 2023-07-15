
//swaping of the first and last element in array
//Swaping of element
import java.util.Scanner;

class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit of array");
		int n = sc.nextInt();
		int a[] = new int[n];
        
		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int temp = a[0];
			a[0] = a[n - 1];
			a[n - 1] = temp;
		}
		System.out.println("Swaping of the element");
		for (int i = 0; i < n; i++) {
			System.out.println("  " + a[i]);
		}
	}
}
