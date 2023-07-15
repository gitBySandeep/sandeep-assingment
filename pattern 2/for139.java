/*
   *
  *_*
 *_*_*
*_*_*_*
 *_*_*
  *_*
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
				if (k % 2 == 0)
					System.out.print("_");
				else
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
				if (k % 2 == 1)
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println();
			m = m - 2;
		}

	}
}
