/*
1
10
101
1010
10101
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
				    if (j % 2 == 0)
					    System.out.print(0);
				    else
					    System.out.print(1);
			}
			System.out.println();
		}
	}
}