/*
1
222
33333
4444444
555555555
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(i);
            }
			System.out.println();
		}
	}
}