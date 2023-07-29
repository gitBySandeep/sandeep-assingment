// Write a Java program to swap first and last element of an integer 1-d array.
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,i,j,temp=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		int a[] = new int[n];

	    System.out.println("element of first array");
		    for (i =0; i<n; i++) {
		  	    a[i] = sc.nextInt();
		    }
		
		System.out.println("After swap first and last element");
		for (i=0; i<n; i++) {
		    temp=a[0];
			a[0] = a[n-1] ;
			a[n-1] = temp ;
		System.out.println(a[i]);
		}
		
	}
}	