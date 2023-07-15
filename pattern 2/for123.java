/*
*
*_*
*___* 
*_____* 
*********
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, c = 1;
		for (i = 1; i <= 9; i = i + 2) {
			for (int j = 4; j >= c; j--) {
				System.out.print(" ");
			}

			c++;

			for (int j = 1; j <= i; j++) {
				if ((i == 9 || j == 1 || j == i))
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println(" ");
		}

	}
}
