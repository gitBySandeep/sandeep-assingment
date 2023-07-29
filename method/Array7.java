//// sum and product of all number

import java.util.Scanner;
class Array7{
   public void product(int a[]){	
	int sum =0, p = 1;
		for (int i = 0; i <a.length; i++) {
			sum = sum + a[i];
			p = p * a[i];
		}
		System.out.println("sum of all number=" + sum);
		System.out.print("product of all number=" + p);
	 }	
}
		
class NumberTest{
    public static void main(String[]args){
	    Array7 obj=new Array7();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		System.out.println("enter number");
		for (int i =0; i<a; i++) {
			x[i] = sc.nextInt();
        }
	    obj.product(x);		
	}
}	