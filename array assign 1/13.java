//Find the first repeating element in array of integers
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		    for (i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
		    
			int c=0;
			for (i = 0; i < n; i++) {
			    for (j= i+1; j < n; j++){
		  	    if (a[i]==a[j])
				break;
				}
				c++;
			if(c==1)
			System.out.println("first repeat element :"+a[i]);
            break;			
						
		    }
			
	}
}	