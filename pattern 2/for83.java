/*
A
AB
A C
A  D
ABCDE
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 65; i <= 69; i++) {
			for (j = 65; j <= i; j++) {
				if (j == i || i == 69 || j == 65) {
					System.out.print((char) (j));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
