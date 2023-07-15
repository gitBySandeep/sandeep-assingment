/*

*        *
**      **
***    ***
****  ****
***** *****
*/

import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, s = 1, m = 5;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 11; j++) {
				if (i == 5 && j != 6 || i == 4 && j <= 4 || i == 4 && j >= 8 || i == 3 && j <= 3 || i == 3 && j >= 9
						|| i == 2 && j <= 2 || i == 2 && j >= 10 || i == 1 && j == 1 || i == 1 && j == 11)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}