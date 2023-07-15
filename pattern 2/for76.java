/*
A
BB
CCC
DDDD
EEEEE
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 65; i <= 69; i++) {
			for (j = 65; j <= i; j++) {

				System.out.print((char) (i));

			}
			System.out.println();
		}
	}
}