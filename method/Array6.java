//wap to search a particular number in given array and print its position

import java.util.Scanner;
class Array6{
   public void prime(int a[],int b){	
		boolean flag=false;
		int i;
		for ( i = 0; i <a.length; i++) {
            if (a[i] == b) {
            flag=true;
			System.out.println(a[i]+"is found in index"+i);
		   }
		}	
		if(flag =false)
			System.out.println("element is not found ");
   }	
}
		
class NumberTest{
    public static void main(String[]args){
	    Array6 obj=new Array6();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		System.out.println("enter number");
		for (int i =0; i<a; i++) {
			x[i] = sc.nextInt();
        }
		System.out.println("enter number for compare");
        int b = sc.nextInt();
	    obj.prime(x,b);		
	}
}	