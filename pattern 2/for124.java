/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, c = 11, d = 1;
		for (i = 0; i < 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			int a = 1;
			for (k = 0; k <= i; k++) {
				System.out.print(a + " ");

				a = a * (i - j) / (j + 1);

			}

			System.out.println("\n");
		}
	}
}