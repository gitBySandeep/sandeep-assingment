//print max and min;

import java.util.Scanner;
class Array3{
   public void sum(int a[]){
        int max = a[0];
		int min = a[0];
        for (int i = 0; i <a.length; i++) {
			if (max < a[i])
				max = a[i];
	
			if (min > a[i])
				min = a[i];
		}
        System.out.println("max number in all number :" + max);
		System.out.println("min number in all number :" + min);
	}
}
		
class NumberTest{
    public static void main(String[]args){
	    Array3 obj=new Array3();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		
		System.out.println("enter number");
		for (int i =0; i<a; i++) {
			x[i] = sc.nextInt();
        }
	    obj.sum(x);
	}
}	