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
class Array42{
    public void num(int a[]){
    	int n,i,j;
		for (i=0; i<a.length; i++){
			for (j=i+1; j<a.length; j++){
				if(a[i]-a[j]==0){
					break;
					}
				}
	    System.out.println("Output-yes");
         break;
        }	
	}
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array42 obj=new Array42();
        System.out.println("size of first array ");
		n = sc.nextInt();
        int x[] = new int[n];
 		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
      obj.num(x);
	} 
}  
	
		    
