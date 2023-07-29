/*32. Given two arrays of integers A and B of sizes M and N respectively. Write a Write a c program, 
which will produce a third array named C. such that the following sequence is followed. 
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
		
		System.out.println("element of fir st array");
		    for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
		
		System.out.println("element of second array");
		    for (i = 0; i < m; i++) {
		  	    a1[i] = sc.nextInt();
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
	
	System.out.println("after arrange even and Odd order");
	    for(i=0;i<a2.length;i++){
            if(a2[i]%2==0)
		System.out.print(a2[i]+" ");		
		}	
		for(i=0;i<a2.length;i++){
            if(a2[i]%2==1)
		System.out.print(a2[i]+" ");		
		}			
    }	
} 
	