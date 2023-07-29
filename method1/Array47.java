 // Write a Java program to swap first and last element of an integer 1-d array.

import java.util.Scanner;
class Array47{
    public void num(int a[]){
		int n,i,j,temp=0;
		System.out.println("After swap first and last element");
		for (i=0; i<a.length; i++) {
		    temp=a[0];
			a[0] = a[a.length-1] ;
			a[a.length-1] = temp ;
		System.out.println(a[i]);
		}
	}
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array47 obj=new Array47();
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
	
		    
