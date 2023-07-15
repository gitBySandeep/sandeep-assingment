
//swaping of array
import java.util.Scanner;

class Test {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int a1[] = { 6, 7, 8, 9, 10 };
		int temp;

		System.out.println("number of first array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("number of second array");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			a[i] = a1[i];
			a1[i] = temp;
		}

		System.out.println("swapping of  array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.println();

		for (int i = 0; i < a1.length; i++) {
			System.out.print(" " + a1[i]);
		}
	}
}
