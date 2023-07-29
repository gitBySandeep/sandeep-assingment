//28. P is one-dimensional array of integers. Write a Java program search for a data VAL from P. If VAL is present in the array then “element found ” otherwise “element not found” should be displayed. 
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
		
		boolean flag=false;
		System.out.println("enter element check in array");
		int b=sc.nextInt();
		for (i=0; i<n; i++){
		   if(a[i]==b){
			   flag=true;
		    }
		}
		if(flag)
			System.out.println("element are found");
		else
			System.out.println("element are not found");
	}
}	