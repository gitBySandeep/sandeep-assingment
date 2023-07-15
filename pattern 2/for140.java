/*
*
***
***** 
******* 
***** 
*** 
*
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, s = 1, m = 5;
		for (i = 4; i >= 1; i--) {
			for (j = i - 1; j >= 1; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= s; k++) {
				System.out.print("*");
			}
			System.out.println();
			s = s + 2;
		}
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (k = 1; k <= m; k++) {
				System.out.print("*");
			}
			System.out.println();
			m = m - 2;
		}

	}
}
