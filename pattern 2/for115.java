/*
11111
2222
333
44
5

*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, c = 1;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
            for (k = 1; k <= i; k++) {
                System.out.print(c);
			}
			c++;
        System.out.println();
		}
	}
}