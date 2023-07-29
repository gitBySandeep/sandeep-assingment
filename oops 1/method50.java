//50) WAP to find out all the palindrome numbers between two entered numbers
import java.util.Scanner;
class Palindrome{
    public void num(int a,int b){
        int rev = 0, r, i, j, t = 0;

		for (i = a; i <= b; i++) {
			for (j = i; j > 0;) {
				r = j % 10;
				j = j / 10;
				rev = rev * 10 + r;
            }
			if (i == rev)
				System.out.println(i + "is pallindrome number");
			rev = 0;
		
		}
    }	
}	
	

class NumberTest{
    public static void main(String[]args){
	    Palindrome obj=new Palindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		System.out.println("enter number ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	
