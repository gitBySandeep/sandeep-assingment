//41) WAP to find out LCM of a number

import java.util.Scanner;
class Lcm{
    public void num(int a,int b){
		int i,m=0;
	    int max = a>b ? a:b;
		for ( i = max;i>= max ;i++) {
            if (i % a == 0 && i % b == 0)
				m= i;
			if(m>=a&&m>=b) 
				break;
		}
		System.out.println("lcm of the number " + m);
    }	
}	

class NumberTest{
    public static void main(String[]args){
	    Lcm obj=new Lcm();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		System.out.println("enter number");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	
