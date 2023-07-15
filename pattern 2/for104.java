/*
1
12
123
1234
12345
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, sp;
		for (i = 1; i <= 5; i++) {
			for (sp = 4; sp >= i; sp--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}
	}
}
