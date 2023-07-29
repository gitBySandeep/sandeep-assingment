//Write a program to reverse the element of array.

import java.util.Scanner;
class Array48{
    public void num(int a[]){
		int r,rev=0;
        System.out.println("after reverse Array" );
   		    for (int i = 0; i < a.length; i++) {
		        while(a[i]>0){
		        r=a[i]%10;
		        rev=rev*10+r;
		        a[i]=a[i]/10;
		    }   
		    System.out.print( rev);
		    rev=0;
            System.out.println();		 
	    }		 
	}
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array48 obj=new Array48();
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
	
		    
