/*
ABCDE
A__D
A_C
AB
A
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, c;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
                for (k = 1; k <= i; k++) {
				    if (i == 4 && (k == 2 || k == 3))
					    System.out.print("_");
				    else if (i == 3 && k == 2)
					    System.out.print("_");
				    else
					System.out.print((char) (k + 64));
			    }
            System.out.println();
		}
	}
}
