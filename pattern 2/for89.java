/*
1
123
12345
1234567
123456789
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(j);
            }
			System.out.println();
		}
	}
}