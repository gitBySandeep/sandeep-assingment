//two array equality
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int a1[] = { 1, 2, 3, 4, 5 };
		boolean k = true;

		if (a.length != a1.length)
			k = false;
		else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != a1[i]) {
					k = false;
					break;
				}
			}
		}

		if (k)
			System.out.println("array are equal");
		else
			System.out.println("array are  not equal");

	}
}