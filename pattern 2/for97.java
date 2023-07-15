/*
ABCDE
A  D
A C
AB
A
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		char i, j;
		for (i = 'E'; i >= 'A'; i--) {
			for (j = 'A'; j <= i; j++) {
				if (j == i || i == 'E' || j == 'A') {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
