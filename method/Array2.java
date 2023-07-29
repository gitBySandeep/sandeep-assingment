//sum of all integer

import java.util.Scanner;
class Array1{
   public int sum(int a[]){
        int sum = 0;
		for (int i = 0; i <a.length ; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}
		
class NumberTest{
    public static void main(String[]args){
	    Array1 obj=new Array1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		
		System.out.println("enter number");
		for (int i =0; i<a; i++) {
			x[i] = sc.nextInt();
        }
	    int result=obj.sum(x);
		System.out.print("sum of all number :" + result);
	}
}	