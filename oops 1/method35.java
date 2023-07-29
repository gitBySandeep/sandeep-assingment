//35) WAP to count number of digits

import java.util.Scanner;
class count{
    public int num(int a){
    int i,s=0,r=0;
        while (a > 0) {
			r = a % 10;
			a = a / 10;
			s = s + r;
        }
   return s;    	
	}	
}	

class NumberTest{
    public static void main(String[]args){
	     count obj=new count();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		int result =obj.num(a);
		System.out.println("count of digits  :"+result);
		}
}	
