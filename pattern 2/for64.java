//*
//  * 
//   *
//    *
//     *
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			// for(sp=4;sp>=i;sp--){
			// System.out.print("");
			// }
			for (j = 1; j <= i; j++) {
				if (j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("  ");
		}
	}
}
