/*
1
10
1 1
1  0
10101
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				if (j == i || i == 5 || j == 1) {
					if (j % 2 == 0)
						System.out.print("0");
					else
						System.out.print("1");
				} else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
