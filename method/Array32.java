//Write a program to sort the array.
import java.util.Scanner;
class Array32{
    public void num(int a[]){
    	System.out.println("sorting of array" );
		for(int i=0;i<a.length;i++){
		    for(int j=i+1;j<a.length;j++){
			   if(a[i]>=a[j]){
                int tem=0;
		        tem=a[i];
                 a[i]=a[j];
                a[j]=tem;		  
	        }
        }
	  System.out.println(a[i]);
    }
   }
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array32 obj=new Array32();
        System.out.println("limit of array ");
		n = sc.nextInt();
		int x[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
	    obj.num(x);
	}
}	
