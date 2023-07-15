//Q.3 Write a program to reverse the array.

import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of Array");
		int n=sc.nextInt();
		int r,rev=0;
		int a[] = new int[n];
		
		System.out.println("enter number");
		    for (int i = 0; i < n; i++) {
			    a[i] = sc.nextInt();
	     	}
        System.out.println("after reverse Array" );
   		    for (int i=n-1; i>=0; i--) {
			    System.out.println(a[i]);
		    } 	 
    }
}