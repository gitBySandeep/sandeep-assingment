/*Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

Example 1:
Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5*/

import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
        int a[] = new int[n];

		System.out.println("element of first array");
		    for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
			
			for (i=0; i<n; i++){
			    //for (j=i+1; j<n; j++){
				if(a[i]>0){
				    System.out.print(a[i]);
				}
				if (a[i]<0){
				a[n-i]=a[i];
				System.out.print(a[n-1]);
				}
			}
				
		}	
}
	