

import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				if (i == 1 || i == 9 || j == 1 || j == 9 || i == j || i == 2 && j == 8 || i == 3 && j == 7
						|| i == 4 && j == 6 || i == 6 && j == 4 || i == 7 && j == 3 || i == 8 && j == 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}