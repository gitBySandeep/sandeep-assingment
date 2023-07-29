//39) WAP to check whether entered number is strong or not

import java.util.Scanner;
class strong{
    public void num(int a){
    int r=0,s=0,c=a,m=0;
        for (int i = a; i <= a; i++) {
			 m=i;
			while (m > 0) {
				r = m % 10;
                int fact=1;
			for (int j = 1 ; j <= r; j++) {
					fact = fact * j;
				}
				s = s + fact;
                m = m / 10;
            }				
        }
		if (c==s) {
			System.out.println(" its strong number :" +c);
		} else {
			System.out.println(" its not strong number :"+c);
		}
	}	
}	

class NumberTest{
    public static void main(String[]args){
	    strong obj=new strong();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
	}
}	
