/*
55555
4  4
3 3
22
1
*/

import java.util.Scanner;
class Pattern35{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j;
		for (i = a; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				if (j == i || i == a || j == 1) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern35 obj=new Pattern35();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	