/*
     *
    ***
   *****
  *******
 *********
*/
	
import java.util.Scanner;
class Pattern55{
    public void star(int a){
		System.out.println("Pattern ");
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
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern55 obj=new Pattern55();
		Scanner sc=new Scanner(System.in);
		obj.star(5);
		}
}	
	