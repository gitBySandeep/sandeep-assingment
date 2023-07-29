//53) WAP to print all the strong numbers between two entered numbers
import java.util.Scanner;
class  StrongNumber {
    public void num(int a,int b){
	int r=0,s = 0, i, j;
		for (i = a; i <= b; i++) {
			int m=i;
			while (m > 0) {
				r = m % 10;
                int fact=1;
			    for (j = 1 ; j <= r; j++) {
					fact = fact * j;
				}
				s = s + fact;
                m = m / 10;
				}
		if (s == i)
			System.out.println(i + " is strong number");
		s = 0;	
		}
	}
}	
	
	

class NumberTest{
    public static void main(String[]args){
	    StrongNumber obj=new StrongNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		System.out.println("enter number ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	