/*
17 Find it there is any subarray with sum equals to zero
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
Example 1:
Input:
5
4 2 -3 1 6

Output: 

Yes*/

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
			    for (j=i+1; j<n; j++){
				    if(a[i]-a[j]==0){
					   	break;
					}
				}
				 System.out.println("yes");
                  break;
    			}	
	}
}	