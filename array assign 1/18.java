/*Q.18) Find largest sum contigeous sub array
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

Example 1:
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
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
        int max=-2147483648;
        for(i=0;i<n;i++){
            sum=sum+a[i];
			if(sum>max)
		    max=sum;
		}
		System.out.println("subarray maximum sum :"+max);
	}
}	
