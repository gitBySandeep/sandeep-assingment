//linear search
import java.util.Scanner;
class Array26{
   public void Linear(int a[],int m){
	int i,j;
		boolean flag=false;
		for (i = 0; i < a.length; i++){
		    //for(j=0;j<a.length;j++);
			if(a[i]==m)	
            flag=true;
             //break;
		}	 
		if(flag)
		System.out.println("element are found ");
        else
		System.out.println("element are not found");
	
	}
}	
class NumberTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array26 obj=new Array26();
		System.out.println("limit of array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the check number in array ");
		int m = sc.nextInt();
		
		obj.Linear(a,m);
		
    }
}	