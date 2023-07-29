//56) WAP to print factorial of all the numbers between two entered numbers
import java.util.Scanner;
class  Factorial {
    public void num(int a,int b){
		int i, j, s = 0;
		for (i = a; i <= b; i++) {
			for (j = 1; j <= i; j++) {
				s = i * j;
			}
			System.out.println(+s + " is a factorial number" + i);
			s = 0;
		}
	}
}	
	
	

class NumberTest{
    public static void main(String[]args){
	   Factorial obj=new Factorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		System.out.println("enter number ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	