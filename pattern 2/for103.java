/*
54321
5432
543
54
5
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 5; j >= i; j--) {
                System.out.print(j);
            }
			System.out.println();
		}
	}
}