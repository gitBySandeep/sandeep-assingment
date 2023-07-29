/*

*        *
**      **
***    ***
****  ****
***** *****

*/
import java.util.Scanner;
class Pattern78{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j, k, s = 1, m = 5;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 11; j++) {
				if (i == 5 && j != 6 || i == 4 && j <= 4 || i == 4 && j >= 8 || i == 3 && j <= 3 || i == 3 && j >= 9
						|| i == 2 && j <= 2 || i == 2 && j >= 10 || i == 1 && j == 1 || i == 1 && j == 11)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
    }
}		
class NumberTest{
    public static void main(String[]args){
	    Pattern78 obj=new Pattern78();
		Scanner sc=new Scanner(System.in);
		obj.star(5);
		}
}	
	
	