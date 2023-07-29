//26. Write a Java program to find the largest and smallest element of an array.
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
		
		int max=a[0];
		int min=a[0];
		for (i=0; i<n; i++) {
		    if(max<=a[i]){
			max=a[i];
			}
			if(min>=a[i]){
			min=a[i];
			}
		}
		System.out.println("minimum element :"+min);
		System.out.println("maximum element :"+max);
    }
}	
			