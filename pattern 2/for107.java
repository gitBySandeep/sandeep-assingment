/*
A
AB
ABC
ABCD
ABCDE
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, sp;
		for (i = 65; i <= 69; i++) {
			for (sp = i; sp < 68; sp++) {
                System.out.print(" ");
			}
			for (j = 65; j <= i; j++) {
                System.out.print((char) (j));
			}
			System.out.println();
		}
	}
}