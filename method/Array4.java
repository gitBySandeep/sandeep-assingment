//print all even number

import java.util.Scanner;
class Array4{
   public void even(int a[]){
	   System.out.println("even number");	
		for (int i = 0; i <a.length; i++) {
			if (a[i] % 2 == 0){
				System.out.println(a[i]);
            }	
		}
   }	
}
		
class NumberTest{
    public static void main(String[]args){
	    Array4 obj=new Array4();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		System.out.println("enter number");
		for (int i =0; i<a; i++) {
			x[i] = sc.nextInt();
        }
	    obj.even(x);		
	}
}	