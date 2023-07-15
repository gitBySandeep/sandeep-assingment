/*
A B C D E
A B C D
A B C
A B
A
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, c = 69;
		for (i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 65; j <= c; j++) {
				System.out.print(" " + (char) (j));
			}
			c--;
			System.out.println(" ");
		}

	}
}