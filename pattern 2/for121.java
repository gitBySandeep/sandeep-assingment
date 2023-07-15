/*
1
123
12345
1234567
123456789
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, s = 1;
		for (i = 5; i >= 1; i--) {
			for (j = i - 1; j >= 1; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= s; k++) {
				System.out.print(k);
			}
			s = s + 2;
			System.out.println();

		}
	}
}