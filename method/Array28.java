//search two element
import java.util.Scanner;
class Array28{
   public void Linear(int a[],int m,int k){
	int i,j;
	    boolean flag1=false;
		boolean flag2=false;
		for (i = 0; i <a.length; i++){
		    if(a[i]==m)
            flag1=true;
			
		    if(a[i]==k)
            flag2=true;
			
			if(flag1 && flag2)
             break;
			 
		}	 
		if(flag1&&flag2){
		System.out.println("element are found ");
        }else if(flag1){
		System.out.println(" first element are  found but second not found ");
		}else if(flag2){
		System.out.println(" first element are not found but  second found ");
		}
		else{
			System.out.println("Both are not found");
		}
	}
}	
class NumberTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array28 obj=new Array28();
		System.out.println("limit of array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the check number in array ");
		int m = sc.nextInt();
		System.out.println("enter the check number in array ");
		int k = sc.nextInt();
		obj.Linear(a,m,k);	
    }
}	

