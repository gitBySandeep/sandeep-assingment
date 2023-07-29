//35. Write a java program to implement selection sort algoritm
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
		
		System.out.println("selection sorting");
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
    }	
} 
	
