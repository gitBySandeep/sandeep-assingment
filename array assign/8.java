/*Q.7 Sub array with given sum
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
Example 1:
Input:
N = 5, S = 12*/

import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,i,j=0,ind=0,ind1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
        int a[] = new int[n];

		System.out.println("element of first array");
		    for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
			
		System.out.println("enter the sum");
        
		int s=sc.nextInt();		 
			
			for(i=0;i<n;i++){
			     int sum=0;
				for(j=i;j<n;j++){
				sum=sum+a[j];
				if(sum==s)
		            ind=i;
				    ind1=j;
					System.out.println("index are found :"+ind+ind1);
					
		   }	
		      if(sum==s)
			   System.out.println(i);
		       System.out.println(j);
		    break;
		}	
		
	}
}	