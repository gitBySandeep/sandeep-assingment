/*
a
ab
abc
abcd
abcde
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i,j;
		for (i = 97; i <= 101; i++) {
			for (j = 97; j <= i; j++) {
				System.out.print((char) (j));
			}
			System.out.println("");
		}

	}
}