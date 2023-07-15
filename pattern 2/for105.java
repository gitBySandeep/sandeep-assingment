/*
1
22
333
4444
55555
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
                System.out.print(i);
			}
			System.out.println();
		}
	}
}
