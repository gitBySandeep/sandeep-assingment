//majority element of sorted array

import java.util.Scanner;
class Array20{
    public void majority(int a[]){	
		int m = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					m = a[i];
			}
		}
		System.out.print("majority Element :" + m);
	
	}
}	
		
class NumberTest{
    public static void main(String[]args){
	    Array20 obj=new Array20();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		System.out.println("enter number");
		for (int i =0; i<x.length; i++){ 
			x[i] = sc.nextInt();
        }
	    obj.majority(x);
	}	
}	