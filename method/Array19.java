//peak element which is Big its neighbour

import java.util.Scanner;
class Array19{
    public void peak(int a[]){	
		System.out.println("peak element");
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1]);
			System.out.println(a[i]);
		}
	}
}	
		
class NumberTest{
    public static void main(String[]args){
	    Array19 obj=new Array19();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		System.out.println("enter number");
		for (int i =0; i<x.length; i++){ 
			x[i] = sc.nextInt();
        }
	    obj.peak(x);
	}	
}	