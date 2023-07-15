/*
5
44
333
2222
11111
*/

import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, sp;
		for (i = 5; i >= 1; i--) {
			for (sp = i; sp >= 2; sp--) {
                System.out.print(" ");
			}
			for (j = 5; j >= i; j--) {
                System.out.print(i);
			}
			System.out.println();
		}
	}
}