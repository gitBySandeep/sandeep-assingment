/*
123456789
1+++++7
1+++5
1+3
1
*/	
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i;
		for (i = 9; i >= 1; i = i - 2) {
			for (int j = 9; j >= i; j = j - 2) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				if (i == 9 || j == i || j == 1)
					System.out.print(j);
				else
					System.out.print("+");
			}
			System.out.println();
		}

	}
}