//46) WAP to find out the sum of first and last digit of a user entered number

import java.util.Scanner;
class Sum{
    public int num(int a){
    int i,s=0,r=0;;
        r = a % 10;
		while (a != 0) {
			s = a % 10;
			a = a / 10;
		}
		s = s + r;
	return s;    	
	}	
}	

class NumberTest{
    public static void main(String[]args){
	     Sum obj=new Sum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		int result =obj.num(a);
		System.out.println("sum of first and last digit  :"+result);
		}
}	
