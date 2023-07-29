/*29. Suppose a one-dimensional array AR containing integers is arranged in ascending order. Write a java program to search for an 
integer from AR with the help of Binary search method,*/ 
	
import java.util.Scanner;
class Array49{
    public boolean num(int a[]){
	int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("after sorting of array Ascending order");
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
		System.out.println("enter element search in array ");
		int ele = sc.nextInt();
		boolean flag=false;
		int low,high,mid;
		low=0;
		high=a.length-1;
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
		return flag;
	}
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array49 obj=new Array49();
        System.out.println("size of first array ");
		n = sc.nextInt();
        int x[] = new int[n];
 		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
    boolean result=obj.num(x);
	if(result)
		    System.out.println("element are found");
		else	
		System.out.println("element are not found");	
	} 
}  
	
		    
