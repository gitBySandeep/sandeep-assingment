/*
a
bc
d f
g  j
klmno
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, a = 97;
		for (i = 97; i <= 101; i++) {
			for (j = 97; j <= i; j++) {
				if (j == i || i == 101 || j == 97) {
					System.out.print((char) (a));
					a++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
