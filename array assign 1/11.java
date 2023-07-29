/*Q.11 Count pair with given sum.
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

Example 1:
Input:
N = 4, K = 6
arr[] = {1,5,7,1}
*/
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
		
		int count=0;
		System.out.println("enter sum");
		m=sc.nextInt();
		    for (i = 0; i < n; i++){
			    for (j = i+1; j< n; j++){
				    if (a[i]+a[j]==m)
					count++;
				}
			}	
		System.out.println("pair of sum"+" " +m+" "+ "is  :"+count);
	}
}	