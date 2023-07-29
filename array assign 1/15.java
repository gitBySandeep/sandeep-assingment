/*
 Q.15
Sub with equal 0s and 1s
Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 
Example 1:
Input:
n = 7
A[] = {1,0,0,1,0,1,1}
Output: 8
Explanation: The index range for the 8 
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
(4, 5) ,(2, 5), (0, 5), (1, 6)
*/
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,i,j,zcount=0,ocount=0;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		int a[] = new int[n];

	    System.out.println("element of first array");
		    for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
		    
		for (i=0; i<n; i++) {
			for(j= i+1; j<n; j++){
				zcount=0;
				ocount=0;
				    for(int k=i;k<=j;k++){
			            if(a[k]==0){
                        zcount++;
				    }
				    else{
					ocount++;
			        }
		        }
            if(zcount==ocount){
	        count++; 		
		   }
	    }
    }	
		System.out.println("subarray count :"+count);	
	}
}	
