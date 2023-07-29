//23. Write a Java program to find the sum and average of one dimensional integer array.
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,i,j,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		int a[] = new int[n];

	    System.out.println("element of first array");
		    for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
		
		for (i=0; i<n; i++) {
		    sum=sum+a[i];
		}
        int average=sum/n;	
        System.out.println("sum of all element"+sum);
        System.out.println("average of all element"+average);
	}
}	
		