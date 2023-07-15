/*
A
BCD
EFGHI
JKLMNOP
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int count = 65, i, j;
		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print((char) (count));
				count++;
			}
            System.out.println();
		}

	}
}
