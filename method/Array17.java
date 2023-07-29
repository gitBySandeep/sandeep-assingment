//two array equality
import java.util.Scanner;
class Array17{
   public void shorting(int a[],int b[]){	
       boolean k=true;
	   if (a.length != b.length)
			k = false;
		else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					k = false;
					break;
				}
			}
		}
        if (k)
			System.out.println("array are equal");
		else
			System.out.println("array are  not equal");
	}
}	
		
class NumberTest{
    public static void main(String[]args){
	    Array17 obj=new Array17();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of two Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		int y[]=new int[a];
		System.out.println("enter number of first array");
		for (int i =0; i<x.length; i++) {
			x[i] = sc.nextInt();
        }
		
		System.out.println("enter number of second array");
		for (int i =0; i<y.length; i++) {
			y[i] = sc.nextInt();
        }
	    obj.shorting(x,y);
	}	
}	