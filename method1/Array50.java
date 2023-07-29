/*
30. Suppose A, B, C are arrays of integers of size M, N, and M + N respectively. The numbers in array A appear in ascending order while
 the numbers in array B appear in descending order. Write a java progtam to produce third array C by merging arrays A and B in ascending order. . 
*/
	
import java.util.Scanner;
class Array50{
    public void num(int a[],int b[],int c[]){
		int i,j;
		System.out.println("after sorting of first array Ascending order");
		for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
			    if(a[i]>a[j]){
			        int temp=a[i];
			        a[i]=a[j];
			        a[j]=temp;
		        }
		    }
		System.out.println(a[i]);
		}
		
		System.out.println("after sorting of array second descending order");
		for(i=0;i<b.length;i++){
            for(j=i+1;j<b.length;j++){
			    if(b[i]<b[j]){
			        int temp=b[i];
			        b[i]=b[j];
			        b[j]=temp;
		        }
		    }
		System.out.println(b[i]);
		}
		
		for(i=0;i<c.length;i++){
			if(i<a.length){
			c[i]=a[i];
		}
        	else{
			c[i]=b[i-a.length];
		}		
		}	
		System.out.println("after merge two array arrange ascending order");
		for(i=0;i<c.length;i++){
            for(j=i+1;j<c.length;j++){
				if(c[i]>c[j]){
				int temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			    }
			}
			System.out.println(c[i]);
	    }

	}
}	
class NumberTest{
	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		Array50 obj=new Array50();
        System.out.println("size of two array ");
		n = sc.nextInt();
		m = sc.nextInt();
        int x[] = new int[n];
 		int y[] = new int[m];
 		int z[] = new int[n+m];
	    
		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
		
		System.out.println("element of second array");
		for (int i = 0; i < m; i++) {
			y[i] = sc.nextInt();
        }
    obj.num(x,y,z);
	} 
}  
	
		    
