/*
     *
    * *
   * * *
  * * * *
 * * * * *
*/
	
import java.util.Scanner;
class Pattern51{
    public void star(int a){
		System.out.println("Pattern ");
 		int i, j, k;
		for (i = 1; i <= a; i++) {
			for (j= 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {

				System.out.print(" " + "*");
			}

			System.out.println();
		}
	
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern51 obj=new Pattern51();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	