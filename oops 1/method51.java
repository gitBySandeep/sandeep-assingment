//51) WAP to reverse all the numbers between two entered numbers
import java.util.Scanner;
class  ReverseNumber {
    public void num(int a,int b){
        int rev = 0, r, i, j;
		for (i = a; i <= b; i++) {
			for (j = i; j > 0;) {
				r = j % 10;
				j = j / 10;
				rev = rev * 10 + r;
            }
			System.out.println(rev + " is reverse number");
			rev = 0;
	    }
    }	
}	
	

class NumberTest{
    public static void main(String[]args){
	   ReverseNumber obj=new ReverseNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		System.out.println("enter number ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	
