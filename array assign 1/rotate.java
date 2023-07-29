//Write a program to cyclically rotate array by one.

import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,m,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		    for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
		
        int temp=a[0];
		for (i=1;i<n;i++){
		int c=a[i];
			a[i]=temp;
			temp=c;
			}
			a[0]=temp;
		
		System.out.println("rotate array by one");
		for (i=0;i<n;i++){
            System.out.println(a[i]);				
		}
	}
}	