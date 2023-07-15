/*
x
xx
xxx
xxxx
xxx
xx
x
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("X");
			}
			System.out.println(" ");
		}
		for (i = 3; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("X");
			}
			System.out.println(" ");
		}

	}
}