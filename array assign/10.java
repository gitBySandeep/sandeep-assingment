
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

			for (i=0; i<n; i++){
				for (j=i+1; j<m;j++){
				if(a[i]==b[j]){
				continue;
				}
			System.out.println("union"+a[i]);	
			}
		}	
        	for (i=0; i<n; i++){
			    for (j=i+1; j<m; j++){
				if(a[i]==b[j]){
				System.out.println("intersection"+a[i]);
			}
				
			}
		}
    }		
}