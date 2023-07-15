/*
123456789
1234567
12345
123
1
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, c = 9;
		for (i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= c; j++) {
				System.out.print(j);
			}
			c = c - 2;
			System.out.println(" ");
		}

	}
}