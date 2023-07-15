/*
1
12
123
1234
123
12
1
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, c = 3;
		for (i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		for (i = 1; i <= 3; i++) {
			for (int j = 1; j <= c; j++) {
				System.out.print(j);
			}
			c--;
			System.out.println(" ");
		}

	}
}