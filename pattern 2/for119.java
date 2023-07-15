/*
X 
X X 
X__X
X____X
X X X X X
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, c = 65;
		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				if ((i == k || i == 5 || k == 1))
					System.out.print(" " + "X");
				else
					System.out.print(" " + "_");
			}

			System.out.println();
		}
	}
}