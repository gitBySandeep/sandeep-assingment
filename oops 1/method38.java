//1) WAP to check whether entered number is Armstrong or not

import java.util.Scanner;
class Armstrong{
    public void num(int a){
    int r=0,t=0,c=a;
        while (a > 0) {
			r = a % 10;
			a = a / 10;
			t = t+(r*r*r);
        }
		
	    if(c==t){
            System.out.println("its Armstrong number :"+c);
	    }	
	    else{
	        System.out.println("not a Armstrong number :"+c);
        }
	}	
}	

class NumberTest{
    public static void main(String[]args){
	    Armstrong obj=new Armstrong();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
	}
}	
