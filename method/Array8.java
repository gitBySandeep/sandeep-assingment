//Initialize and print all elements of a 2D array

import java.util.Scanner;
class Array8{
   public void product(int a[][]){	
		int sum = 0, p = 1;
		System.out.println("2D Array ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
            }
			System.out.println();
		}
    }	
}
		
class NumberTest{
    public static void main(String[]args){
	    Array8 obj=new Array8();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of 2D Array");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x[][]=new int[a][b];
		System.out.println("enter number");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
			x[i][j] = sc.nextInt();
			}
		}
	    obj.product(x);		
	}
}	