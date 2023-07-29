//40) WAP to count no. Of even and odd digits in a number

import java.util.Scanner;
class Digit{
    public void num(int a){
		int evenc = 0, r, oddc = 0;
		while (a > 0) {
			r = a % 10;

			if (r % 2 == 0) {
				evenc++;

			} else {
				oddc++;

			}
			a = a / 10;
		}
		System.out.println("evenc=" + evenc);
		System.out.println("oddc=" + oddc);
	}	
}	

class NumberTest{
    public static void main(String[]args){
	    Digit obj=new Digit();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
	}
}	
