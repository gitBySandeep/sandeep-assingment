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
class Array43{
    public int num(int a[]){
		int n,i,j;
		int sum=0;
        int max=-2147483648;
        for(i=0;i<a.length;i++){
            sum=sum+a[i];
			if(sum>max)
		    max=sum;
		}
	return max;	
	}
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array43 obj=new Array43();
        System.out.println("size of first array ");
		n = sc.nextInt();
        int x[] = new int[n];
 		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
      int result=obj.num(x);
	  System.out.println("subarray maximum sum :"+result);
	} 
}  
	
		    
