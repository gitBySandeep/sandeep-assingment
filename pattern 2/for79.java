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
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				if (j % 2 == 0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
}
