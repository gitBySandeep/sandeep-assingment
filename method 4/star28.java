/*
***** 
**** 
***
**
* 
*/

import java.util.Scanner;
class Pattern28{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j,m=a;
		for (i = 1; i <= a; i++) {
			for (j = 1; j<=m; j++) {
                System.out.print("*");
            }
			m--;
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern28 obj=new Pattern28();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	