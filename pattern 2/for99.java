/*
55555
4  4
3 3
22
1
*/	
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				if (j == i || i == 5 || j == 1) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}