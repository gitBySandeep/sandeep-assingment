//union and intersection of array
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
		int b[] = new int[m];
		int a1[] = new int[n+m];

		System.out.println("element of first array");
		    for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
		System.out.println("element of second array");
		    for (j = 0; j<m; j++) {
		  	    b[j] = sc.nextInt();
		    }
        System.out.println("intersection of two array");
			for (i=0; i<n; i++){
				for (j=0; j<m;j++){
				if(a[i]==b[j]){
				System.out.println(a[i]);
				}
			}
		}	
        	System.out.println("union of two array");
		    for (i=0; i<a1.length; i++){
			  	
				if(i<n){
				a1[i]=a[i];
			}
			else{
				a1[i]=b[i-n];
			}
		}	
			for (i=0; i<a1.length; i++){
				for (j=0; j<i+1;j++){
				if(a1[i]==a1[j]){
					a1[i]=a1[j];
					break;
				}	
			}
			if(i==j)
				
			System.out.println(a1[i]);
		}
    }		
}