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
class Array38{
    public void num(int a[],int b[],int c[]){
    	int i,j,k;
		System.out.println("common element in three array");
		for (i = 0; i < a.length; i++){
			    for (j=0; j<b.length; j++){
				    for (k=0; k<c.length; k++){
				        if (a[i]==b[j] && a[i]==c[k])
	                System.out.println(a[i]);				
				}
			}	
		}
	}	
} 	
class NumberTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array38 obj=new Array38();
        int n1[] =  {1, 5, 10, 20, 40, 80};
        int n2[] =  {6, 7, 20, 80, 100};
        int n3[] =  {3, 4, 15, 20, 30, 70, 80, 120};

        obj.num(n1,n2,n3);
	}
}	
	
	
        
