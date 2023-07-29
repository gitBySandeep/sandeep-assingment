/*
1
222
33333
4444444
555555555
*/

import java.util.Scanner;
class Pattern27{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j;
		for (i = 1; i <= a; i++) {
			for (j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(i);
            }
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern27 obj=new Pattern27();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	