//36) WAP to reverse a number

import java.util.Scanner;
class reverse{
    public int num(int a){
    int r=0,rev=0;
        while (a > 0) {
			r = a % 10;
			a = a / 10;
			rev = 10*rev + r;
        }
   return rev;    	
	}	
}	

class NumberTest{
    public static void main(String[]args){
	     reverse obj=new reverse();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		int result =obj.num(a);
		System.out.println("reverse number  :"+result);
		}
}	
