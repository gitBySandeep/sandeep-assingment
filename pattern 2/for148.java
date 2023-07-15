/*
 1               
101            
10101         
1010101           
101010101   
10101010101
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, k, c = 1;
		for (i = 1; i <= 6; i++) {
			for (j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				if (k % 2 == 1)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println("");
		}
	}
}