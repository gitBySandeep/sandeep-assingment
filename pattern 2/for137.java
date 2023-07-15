/*
1
12
123
1234
123
12
1

*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, c = 1;
		for (i = 1; i <= 4; i++) {
			for (int sp = 4; sp >= c; sp--) {
				System.out.print(" ");
			}
			c++;
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

		for (i = 3; i >= 1; i--) {
			for (int sp = 4; sp >= i; sp--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println(" ");
		}

	}
}