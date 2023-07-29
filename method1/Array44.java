/* Find Maximum product contigeous sub array 
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
Example 1:
Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
*/

import java.util.Scanner;
class Array44{
    public int num(int a[]){
    	int n,i,j;
		int sum=0;
		int product=1;
        int max=-2147483648;
        for(i=0;i<a.length;i++){
            product=product*a[i];
			if(product>max)
		    max=product;
		}
	return max;	
	}
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array44 obj=new Array44();
        System.out.println("size of first array ");
		n = sc.nextInt();
        int x[] = new int[n];
 		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
      int result=obj.num(x);
		System.out.println("subarray maximum product :"+result);
	} 
}  
	
		    
