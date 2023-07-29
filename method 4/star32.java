/*
EEEEE
DDDD
CCC
BB
A
*/

import java.util.Scanner;
class Pattern32{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j,m=69;
		for (i = 1; i <= a; i++) {
			for (j = 65; j<=m; j++) {
                System.out.print((char)(m));
            }
			m--;
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern32 obj=new Pattern32();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	