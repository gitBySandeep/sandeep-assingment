/*
Q.20 Longest consecutive sequence.
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 
Example 1:
Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
*/

import java.util.Scanner;
class Array45{
    public int num(int a[]){
    	int n,i,j;
		System.out.println("after sorting of array");
		for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
			    if(a[i]>a[j]){
			    int temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
		        }
		    }
		System.out.println(a[i]);
		}
		int c=0;
		int s=a[0];
		for(i=0;i<a.length;i++){
		    if(a[i]==s){
			    c++;
				s++;
            }
	        else{
                break;
			}	
	    }
	return c;	
	}
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array45 obj=new Array45();
        System.out.println("size of first array ");
		n = sc.nextInt();
        int x[] = new int[n];
 		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
      int result=obj.num(x);
		System.out.println(" Longest consecutive Sequence count :"+result);
    } 
}  
	
		    
