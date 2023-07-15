/*
A
AB
A_C
A__D
ABCDE
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, sp, c = 1;
		for (i = 65; i <= 69; i++) {
			for (sp = 4; sp >= c; sp--) {
				System.out.print(" ");
            }
			c++;
			for (j = 65; j <= i; j++) {
				if ((i == 69 || j == i || j == 65))
					System.out.print((char) (j));
				else
					System.out.print("_");
			}
            System.out.println();
		}
	}
}