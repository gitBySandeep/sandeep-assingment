/*

Find common elements in three sorted arrays.
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?
Example 1:
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
*/
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int i,j,k;
		int n1[] =  {1, 5, 10, 20, 40, 80};
        int n2[] =  {6, 7, 20, 80, 100};
        int n3[] =  {3, 4, 15, 20, 30, 70, 80, 120};
        
		System.out.println("common element in three array");
		for (i = 0; i < n1.length; i++){
			    for (j=0; j<n2.length; j++){
				    for (k=0; k<n3.length; k++){
				        if (n1[i]==n2[j] && n1[i]==n3[k])
	                System.out.println(n1[i]);				
				}
			}	
		}
	}
}	