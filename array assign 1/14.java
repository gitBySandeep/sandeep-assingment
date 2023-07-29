/*
Q.14. Find the first 
non-repeating elment in given array of integers
Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.
Example 1:
Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation:
-1 and 2 are repeating whereas 3 is 
the only number occuring once.
Hence, the output is 3.
*/
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		int a[] = new int[n];

	    System.out.println("element of first array");
		for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		}
			
		for (i = 0; i < n; i++) {
		  	for (j = 0; j < n; j++) {
				if(i!=j &&a[i]==a[j]){	
		  		    break;	
				}
			}
			if(j==n){
		        System.out.println("first nonrepeat element :"+a[i]);		
		break;
	   }	
    }
  }
}  