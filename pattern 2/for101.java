/*
*
**
****
*******
***********
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, count = 1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= count; j++) {
                System.out.print("*");
            }
			count = count + i;
			System.out.println();
		}
	}
}