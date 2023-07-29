//5) WAP to find out the factorial of a number.
import java.util.Scanner;
class Number{
    public void num(int a){
	    int fact=1;
		System.out.println("factorial of:"+a);
		for(int i=1;i<=a;i++){
            fact=fact*i;		
		}
		System.out.println(fact);
	}
}	

class NumberTest{
    public static void main(String[]args){
	    Number obj=new Number();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
	}
}	