//kth element in two array

import java.util.Scanner;
class Array21{
    public void majority(int a[],int b[],int c[] ){	
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			if (i < a.length) {
				c[i] = a[i];
			} else {
				c[i] = b[i - a.length];
			} 
		}

		int temp = 0;
		for (int i = 0; i <c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				
				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
			System.out.println("the  sorted array" + c[i]);
		}
		System.out.println("enter position of number :");
		int k = sc.nextInt();
		System.out.println("the" + k + "element of this array is:" + c[k - 1]);
	
	}
}	
		
class NumberTest{
    public static void main(String[]args){
	    Array21 obj=new Array21();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		System.out.println("enter size of second Array");
		int b=sc.nextInt();
	    int x[]=new int[a];
		int y[]=new int[b];
		int z[]=new int[a+b];
		System.out.println("enter number of first array");
		for (int i =0; i<x.length; i++){ 
			x[i] = sc.nextInt();
        }
		System.out.println("enter number of second array");
		for (int i =0; i<y.length; i++){ 
			y[i] = sc.nextInt();
        }
	    
	    obj.majority(x,y,z);
	}	
}	