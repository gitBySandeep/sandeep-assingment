////swaping of the first and last element in array
import java.util.Scanner;
class Array16{
   public void shorting(int a[]){	
        for (int i = 0; i < a.length; i++) {
			int temp = a[0];
			a[0] = a[a.length - 1];
			a[a.length - 1] = temp;
		}
		System.out.println("Swaping of the first and last element");
		for (int i = 0; i < a.length; i++) {
			System.out.println("  " + a[i]);
		}
	}
}	
		
class NumberTest{
    public static void main(String[]args){
	    Array16 obj=new Array16();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		System.out.println("enter number");
		for (int i =0; i<x.length; i++) {
			x[i] = sc.nextInt();
        }
	    obj.shorting(x);
	}	
}	