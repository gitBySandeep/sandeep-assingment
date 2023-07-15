/*
A
ABC
ABCDE
ABCDEEF
ABCDEFGHI
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, s = 0;
		for (i = 5; i >= 1; i--) {
			for (j = i - 1; j >= 1; j--) {
				System.out.print(" ");
			}
			for (k = 0; k <= s; k++) {
				System.out.print((char) (k + 65));

			}

			s = s + 2;
			System.out.println();

		}
	}
}
