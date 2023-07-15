/*a
bc
def
ghij
klmno
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, a = 97;
		for (i = 97; i <= 101; i++) {
			for (j = 97; j <= i; j++) {

				System.out.print((char) (a));
				a++;

			}
			System.out.println();
		}
	}
}