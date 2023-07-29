//55) WAP to print all the odd numbers between two entered numbers
import java.util.Scanner;
class  OddNumber {
    public void num(int a,int b){
	int i, j;
        for (i = a; i <= b; i++) {
			if (i % 2 == 1)
				{
				System.out.println(i + " is Odd number");
			}
		}
	}
}	
	
	

class NumberTest{
    public static void main(String[]args){
	    OddNumber obj=new OddNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		System.out.println("enter number ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	