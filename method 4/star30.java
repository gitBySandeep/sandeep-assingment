/*
55555
4444
333
22
1
*/

import java.util.Scanner;
class Pattern30{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j,m=a;
		for (i = 1; i <= a; i++) {
			for (j = 1; j<=m; j++) {
                System.out.print(m);
            }
			m--;
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern30 obj=new Pattern30();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	