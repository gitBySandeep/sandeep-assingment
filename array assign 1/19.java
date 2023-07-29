/* Find Maximum product contigeous sub array 

Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
Example 1:
Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
*/

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
		int sum=0;
		int product=1;
        int max=-2147483648;
        for(i=0;i<n;i++){
            product=product*a[i];
			if(product>max)
		    max=product;
		}
		System.out.println("subarray maximum product :"+max);
	}
}	
