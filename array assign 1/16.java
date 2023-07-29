
/*Q.16
Rearrange the array in alternating positive and negative items
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with positive number.

Example 1:
Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
*/

import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		
		int a[] = new int[n];	  
		System.out.println("element of first array");
		    for (i = 0; i < n; i++){
		  	    a[i] = sc.nextInt();
		     }
		
		int neg=0,pos=0;
		for(i=0;i<a.length;i++){
			if(a[i]>=0){
			pos++;
		}
        	else{ 
			neg++;
		}		
	}	
		int posi[]=new int[pos];
		int nega[]=new int[neg];
		int count1=0,count2=0;
		for(i=0;i<a.length;i++){
			if(a[i]>=0){
				posi[count1]=a[i];
				count1++;
	        }
		    else{
			nega[count2]=a[i];
				count2++;
	        }
	    }	
		 	
	    System.out.println("after arrange Alternating Positive and Negetive");
	    for(i=0,j=0,k=0;i<a.length;i++){
            if(i>=pos && i>=neg){
            continue;			
		}			
        if(i<pos){
            System.out.println(posi[k]+" ");
		k++;
		}
        			
        if(i<neg){
            System.out.println(nega[j]+" ");
		j++;
		}
	}	
    }	
}  
		