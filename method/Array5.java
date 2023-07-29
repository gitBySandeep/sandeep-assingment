//print all prime number

import java.util.Scanner;
class Array5{
   public void prime(int a[]){
	   System.out.println("prime number");	
		int i,j,c=0;
		for (i = 0; i < a.length; i++) {
			for ( j = 2; j <= a[i] / 2; j++) {
				if (a[i] % j == 0) {
					c++;
					break;
				}
			}
			if (c == 0)
				System.out.println(a[i] + " is a prime number");
			c = 0;
		}
   }	
}
		
class NumberTest{
    public static void main(String[]args){
	    Array5 obj=new Array5();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		System.out.println("enter number");
		for (int i =0; i<a; i++) {
			x[i] = sc.nextInt();
        }
	    obj.prime(x);		
	}
}	