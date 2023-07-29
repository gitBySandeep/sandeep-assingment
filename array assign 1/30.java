/*
30. Suppose A, B, C are arrays of integers of size M, N, and M + N respectively. The numbers in array A appear in ascending order while
 the numbers in array B appear in descending order. Write a java progtam to produce third array C by merging arrays A and B in ascending order. . 
*/
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,m,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		System.out.println("size of second array ");
		m = sc.nextInt();
		
		int a[] = new int[n];
        int a1[] = new int[m];
		int a2[] = new int[n+m];
		
		System.out.println("element of first array");
		    for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
		
		System.out.println("element of second array");
		    for (i = 0; i < m; i++) {
		  	    a1[i] = sc.nextInt();
		    }
		
		
		System.out.println("after sorting of first array Ascending order");
		for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
			    if(a[i]>a[j]){
			        int temp=a[i];
			        a[i]=a[j];
			        a[j]=temp;
		        }
		    }
		System.out.println(a[i]);
		}
		
		System.out.println("after sorting of array second descending order");
		for(i=0;i<m;i++){
            for(j=i+1;j<m;j++){
			    if(a1[i]<a1[j]){
			        int temp=a1[i];
			        a1[i]=a1[j];
			        a1[j]=temp;
		        }
		    }
		System.out.println(a1[i]);
		}
		
		for(i=0;i<a2.length;i++){
			if(i<n){
			a2[i]=a[i];
		}
        	else{
			a2[i]=a1[i-n];
		}		
		}	
		System.out.println("after merge two array arrange ascending order");
		for(i=0;i<n+m;i++){
            for(j=i+1;j<n+m;j++){
				if(a2[i]>a2[j]){
				int temp=a2[i];
				a2[i]=a2[j];
				a2[j]=temp;
			    }
			}
			System.out.println(a2[i]);
	    }
    }	
} 
	