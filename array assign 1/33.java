//33. Write a java program to impelment binary search algorithm
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
		System.out.println("after sorting of array Ascending order");
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
		System.out.println("enter element search in array ");
		int ele = sc.nextInt();
		boolean flag=false;
		int low,high,mid;
		low=0;
		high=n-1;
		while(low<=high){
		    mid=(low+high)/2;
			
			if(ele==a[mid]){
			flag=true;
			break;
		}	
		else if(ele>a[mid]){
		    low=mid+1;
		}	else{
			low=mid-1;
		}
	}	
		if(flag)
		    System.out.println("element are found");
		else	
		System.out.println("element are not found");
	}
}	