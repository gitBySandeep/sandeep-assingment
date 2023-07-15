/*
1
11
1*1
1**1
11111
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i, j, sp;
		for (i = 1; i <= 5; i++) {
			for (sp = 4; sp >= i; sp--) {
                System.out.print(" ");
			    }
			    for (j = 1; j <= i; j++) {
				    if ((i == 5 || j == i || j == 1))
					    System.out.print("1");
				    else
					    System.out.print("*");
			}
            System.out.println();
		}
	}
}
