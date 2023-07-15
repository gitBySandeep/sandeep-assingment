/*

1
212
32123
4321234
543212345
*/  
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (j = 2; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println("");
		}
	}
}