//41) WAP to find out HCF of a number

import java.util.Scanner;
class HCF{
    public void num(int a,int b){
		int i,m=0;
		int max = a > b ? a : b;
		for (i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0)
			 	m = i;
			if(m>1)
				break;
	        }
		System.out.println("HCF of the number " + m);

    }	
}	

class NumberTest{
    public static void main(String[]args){
	    HCF obj=new HCF();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		System.out.println("enter number");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	
