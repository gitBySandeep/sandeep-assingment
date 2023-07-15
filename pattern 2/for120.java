/*
*
***
*****
*******
*********
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, s = 1;
		for (i = 5; i >= 1; i--) {
			for (j = i - 1; j >= 1; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= s; k++) {
				System.out.print("*");
			}
			System.out.println();
			s = s + 2;
		}
	}
}
 
  
  