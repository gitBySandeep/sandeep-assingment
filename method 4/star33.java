/*
*****
*  *
* *
**
*
*/

import java.util.Scanner;
class Pattern33{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j,m=a;
		for (i = a; i >= 1; i--) {
			for (j = 1; j<=i; j++) {
			    if(i==a||i==j||j==1)
                    System.out.print("*");
                else
			    System.out.print(" ");
               }
			   m--;
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern33 obj=new Pattern33();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	