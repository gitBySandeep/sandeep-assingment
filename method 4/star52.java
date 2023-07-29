/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
*/
	
import java.util.Scanner;
class Pattern52{
    public void star(int a){
		System.out.println("Pattern ");
 		int i, j, k;
		for (i = 1; i <= a; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {

				System.out.print(" " + k);
			}

			System.out.println();
		}
	
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern52 obj=new Pattern52();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	