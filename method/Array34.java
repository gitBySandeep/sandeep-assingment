/*Q.7 Sub array with given sum
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
Example 1:
Input:
N = 5, S = 12 
*/

import java.util.Scanner;
class Array34{
    public void num(int a[],int s){
    	System.out.println("index number in array" );
		int i,j,ind=0,ind1=0;
		for(i=0;i<a.length;i++){
			int sum=0;
			for(j=i;j<a.length;j++){
				sum=sum+a[j];
				if(sum==s){
		            ind=i;
				    ind1=j;
					System.out.println((ind+1)+"  "+(ind1+1));
				}	
		    }	
		}	
    }
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array34 obj=new Array34();
        System.out.println("limit of array ");
		n = sc.nextInt();
		int x[] = new int[n];
        System.out.println("enter the sum of element");
        int s=sc.nextInt();		 
		
		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
	    obj.num(x,s);
	}
}	
