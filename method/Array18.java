//increment all element by one
import java.util.Scanner;
class Array18{
    public void increment(int a[]){	
        System.out.println("increment all element by one");
		    for (int i = 0; i < a.length; i++){
			a[i] = a[i] + 1;
			System.out.println(a[i]);
		}
	}
}	
		
class NumberTest{
    public static void main(String[]args){
	    Array18 obj=new Array18();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		System.out.println("enter number");
		for (int i =0; i<x.length; i++) {
			x[i] = sc.nextInt();
        }
	    obj.increment(x);
	}	
}	