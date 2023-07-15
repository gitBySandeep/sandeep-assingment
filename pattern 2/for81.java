/*
1
12
1 3
1  4
12345
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				if (j == i || i == 5 || j == 1) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
