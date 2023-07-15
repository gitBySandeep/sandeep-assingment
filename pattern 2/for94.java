/*
ABCDE
ABCD
ABC
AB
A
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j,d=69;
		for (i = 5; i>=1; i--) {
			for (j = 65; j<= d; j++){
			    System.out.print((char)(j));
            }
			d--;
			System.out.println();
		}
	}
}	
