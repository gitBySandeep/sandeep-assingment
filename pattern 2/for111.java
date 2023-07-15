/*
12345
1234
123
12
1
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			    for (k = 1; k <= i; k++) {
                    System.out.print(k);
			}
            System.out.println();
		}
	}
}
