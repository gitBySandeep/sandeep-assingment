//swaping of two array
import java.util.Scanner;
class Array15{
   public void swaping(int a[],int c[]){	
        System.out.println("shorting of array" );
		    for (int i = 0; i < a.length; i++) {
			    int temp = a[i];
			    a[i] = c[i];
			    c[i] = temp;
		    }
            System.out.println("swapping of  array");
		    for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		    }
            System.out.println();
            for (int i = 0; i < c.length; i++) {
			System.out.print(" " + c[i]);
		}
	}
}	
		
class NumberTest{
    public static void main(String[]args){
	    Array15 obj=new Array15();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		System.out.println("enter size of Array");
		int b=sc.nextInt();
		int x[]=new int[a];
		int y[]=new int[b];
		System.out.println("enter number");
		for (int i =0; i<x.length; i++) {
			x[i] = sc.nextInt();
        }
		System.out.println("enter number");
		for (int i =0; i<y.length; i++) {
			y[i] = sc.nextInt();
        }
	    obj.swaping(x,y);
	}	
}	