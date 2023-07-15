//binary search
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
		low=0;
        high=n-1;
       System.out.println("enter element for check");
        int ele=sc.nextInt();       
		while(low<=high){
        mid=(low+high)/2;
        if(ele==a[mid]){
        flag=true;
        break;
        }
        if(ele>a[mid])
        low=mid+1;
		else
        high=mid-1;
		
	}	
		
	if(flag)		
	System.out.println("element found");
	else
	System.out.println("element not found");
	}
}	