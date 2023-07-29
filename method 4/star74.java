/*
*
***
***** 
******* 
***** 
*** 
*
*/	
import java.util.Scanner;
class Pattern74{
    public void star(int a){
		System.out.println("Pattern ");
	    int i, j, k, s = 1, m = 5;
		for (i = a; i >= 1; i--) {
			for (j = i - 1; j >= 1; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= s; k++) {
				System.out.print("*");
			}
			System.out.println();
			s = s + 2;
		}
		for (i = 1; i <=a-1; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (k = 1; k <= m; k++) {
				System.out.print("*");
			}
			System.out.println();
			m = m - 2;
		}

			
		
    }
}		
class NumberTest{
    public static void main(String[]args){
	    Pattern74 obj=new Pattern74();
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter row ");
		//int a=sc.nextInt();
	    obj.star(4);
		}
}	
	