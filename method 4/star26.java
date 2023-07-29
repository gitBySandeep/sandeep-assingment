/*
1
123
12345
1234567
123456789
*/

import java.util.Scanner;
class Pattern26{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j;
		for (i = 1; i <= a; i++) {
			for (j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(j);
            }
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern26 obj=new Pattern26();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	