//37. Write a java progrtam to implement insertion sort algorithm 
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,i,j,temp=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		int a[] = new int[n];

	    System.out.println("element of first array");
		    for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
		
		for (i = 1; i < n; i++) {
		    temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp){
			a[j]=a[j-1];
			j=j-1;
		}
            a[j]=temp;
		}
		
		for (i = 0; i < n; i++) {
		    System.out.print(a[i]+" ");
		}
	}
}	
		  	 
		