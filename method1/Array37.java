/*Q.11 Count pair with given sum.
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

Example 1:
Input:
N = 4, K = 6
arr[] = {1,5,7,1}
*/
import java.util.Scanner;
class Array37{
    public void num(int a[],int m ){
    		int i,j;
	        int count=0;
		    for (i = 0; i < a.length; i++){
			    for (j = i+1; j< a.length; j++){
				    if (a[i]+a[j]==m)
					count++;
				}
			}	
		System.out.println("pair of sum"+" " +m+" "+ "is  :"+count);
	}	
} 	
class NumberTest{
	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		Array37 obj=new Array37();
        System.out.println("size of first array ");
		n = sc.nextInt();
        System.out.println("enter sum ");
		m = sc.nextInt();
        int x[] = new int[n];
 		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
        obj.num(x,m);
	}
}	
	
	