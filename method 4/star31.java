/*
ABCDE
ABCD
ABC
AB
A
*/

import java.util.Scanner;
class Pattern31{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j,m=69;
		for (i = 1; i <= a; i++) {
			for (j = 65; j<=m; j++) {
                System.out.print((char)(j));
            }
			m--;
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern31 obj=new Pattern31();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	