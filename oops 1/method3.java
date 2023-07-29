//4) WAP to print table of a number.
import java.util.Scanner;
class Number{
    public void num(int a){
	    int sum=0;
		System.out.println("Table of :"+a);
		for(int i=1;i<=10;i++)
		System.out.println(i*a);
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