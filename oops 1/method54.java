//54) WAP to print all the even numbers between two entered numbers
import java.util.Scanner;
class  EvenNumber {
    public void num(int a,int b){
	int  rev = 0, r, i, j;
        for (i = a; i <= b; i++) {
			if (i % 2 == 0)
				{
				System.out.println(i + " is even number");
			}
		}
	}
}	
	
	

class NumberTest{
    public static void main(String[]args){
	    EvenNumber obj=new EvenNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		System.out.println("enter number ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	