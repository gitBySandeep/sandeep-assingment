//37) WAP to check whether entered number is palindrome or not

import java.util.Scanner;
class pallindrome{
    public void num(int a){
    int r=0,rev=0,c=a;
        while (a > 0) {
			r = a % 10;
			a = a / 10;
			rev = 10*rev + r;
        }
		
	    if(c==rev){
            System.out.println("its pallindrome number :"+c);
	    }	
	    else{
	        System.out.println("not a pallindrome number :"+c);
        }
	}	
}	

class NumberTest{
    public static void main(String[]args){
	    pallindrome obj=new pallindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
	}
}	
