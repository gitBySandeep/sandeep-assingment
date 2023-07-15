/*
1
22
3 3
4  4
55555
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				if (j == i || i == 5 || j == 1) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
