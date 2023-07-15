/*
    1
    2
    3
    4
123454321
    4
    3
    2
    1
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, c = 1, d = 1, m = 4;
		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= 4; j++) {
				System.out.print(" ");
			}
			for (k = c; k <= i; k++) {
				System.out.print(k);
			}
			c++;
			System.out.println(" ");
		}
		for (j = 1; j <= 5; j++) {
			if (j == 5)
				System.out.print("123454321");
		}
		System.out.println(" ");

		for (i = 4; i >= 1; i--) {
			for (j = 1; j <= 4; j++) {
				System.out.print(" ");
			}
			for (k = i; k <= i; k++) {
				System.out.print(k);
			}

			System.out.println(" ");
		}
	}
}