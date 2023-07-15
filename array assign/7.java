//Q.6 Sort the array of 0s , 1s and 2s
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n,low ,high ,mid;
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
        int a[] = new int[n];

		System.out.println("element of first array");
		    for (int i = 0; i < n; i++) {
		  	    a[i] = sc.nextInt();
		    }
			
			System.out.println("After sorting of array ");
			int tem=0;
			for (int i = 0; i < n; i++) {
		  	   for(int j=i+1;j<n;j++){
			        if(a[i]>=a[j]){
                    tem=a[i];
                    a[i]=a[j];
                    a[j]=tem;		  
	            }
			}System.out.println(a[i]);
		}
		    
	}
}	