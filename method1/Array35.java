/*Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

Example 1:
Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5*/

import java.util.Scanner;
class Array35{
    public void num(int a[]){
    	int size,i,j,k,pcount=0,ncount=0;
			for (i=0; i<a.length; i++){
			    if(a[i]>0){
				   pcount++;
				}
				else{
					ncount++;
				}
			}
	       int p[]=new int[pcount];
		   int n[]=new int[ncount];
		   for(i=0,j=0,k=0;i<a.length;i++){
			    if(a[i]>=0){
				   p[j]=a[i];
			       j++;
		        }
				else{
				   n[k]=a[i];
       			    k++;
	            }   
		   }
		    for(i=0,j=0;i<a.length;i++){
				if(i<p.length){
					a[i]=p[i];
				}
            else{
                a[i]=n[j];
                j++;
			}
            System.out.print(a[i]+"  ");
		}
	}	
} 	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array35 obj=new Array35();
        System.out.println("limit of array ");
		n = sc.nextInt();
		int x[] = new int[n];
        
		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
	    obj.num(x);
	}
}	
	