//35. Write a java program to implement Bubble sort algoritm
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
		
		System.out.println("bubble sorting");
		for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
				 a[j]=a[j]+a[j+1] ;
				a[j+1]=a[j]-a[j+1];
				a[j]=a[j]-a[j+1];
			    }
			}
			System.out.println(a[i]);
	    }
    }	
} 
	
