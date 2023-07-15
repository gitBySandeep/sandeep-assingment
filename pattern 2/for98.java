/*
*****
####
***
##
*
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				if (i == 1 || i == 3 || i == 5) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}